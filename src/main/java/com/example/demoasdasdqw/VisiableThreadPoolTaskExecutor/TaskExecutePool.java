package com.example.demoasdasdqw.VisiableThreadPoolTaskExecutor;

import com.example.demoasdasdqw.config.TaskThreadPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class TaskExecutePool {

    @Autowired
    private TaskThreadPoolConfig taskThreadPoolConfig;

    @Bean
    public Executor myTaskAsyncPool() {
        //创建线程池对象
        //ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //这里使用我们自己创建的线程池对象类，可打印线程池使用日志信息
        VisiableThreadPoolTaskExecutor executor = new VisiableThreadPoolTaskExecutor();
        //设置线程池属性
        executor.setCorePoolSize(taskThreadPoolConfig.getCorePoolSize());
        executor.setMaxPoolSize(taskThreadPoolConfig.getMaxPoolSize());
        executor.setKeepAliveSeconds(taskThreadPoolConfig.getKeepAliveSeconds());
        executor.setQueueCapacity(taskThreadPoolConfig.getQueueCapacity());
        //设置线程池前缀（可配置到yml文件中进行动态读取）
        executor.setThreadNamePrefix("myExecutor-");

        // setRejectedExecutionHandler：当pool已经达到线程池最大线程max size的时候，如何处理新任务
        // CallerRunsPolicy：不在新线程中执行任务，而是由调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        executor.initialize();
        return executor;
    }


}

