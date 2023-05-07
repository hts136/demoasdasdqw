package com.example.demoasdasdqw.VisiableThreadPoolTaskExecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author HO
 * @Package com.zhitu.thread.ThreadPool
 * @Description 创建ThreadPoolTaskExecutor子类 打印线程池使用情况
 * @Date 2020/8/5 13:32
 * @Version 1.0.0
 */

public class VisiableThreadPoolTaskExecutor extends ThreadPoolTaskExecutor {

    //定义全局日志打印变量
    private static final Logger LOGGER = LoggerFactory.getLogger(VisiableThreadPoolTaskExecutor.class);


    //创建方法打印线程池使用情况
    private void showThreadPoolInfo(String prefix) {
        ThreadPoolExecutor threadPoolExecutor = getThreadPoolExecutor();
        //判断
        if (threadPoolExecutor == null) {
            return;
        }
        //打印线程池使用日志
        LOGGER.info("{}, {},taskCount [{}], completedTaskCount [{}], activeCount [{}], queueSize [{}]",
                this.getThreadNamePrefix(),
                prefix,
                threadPoolExecutor.getTaskCount(),    //任务总数
                threadPoolExecutor.getCompletedTaskCount(),  //已完成任务数
                threadPoolExecutor.getActiveCount(),   //活跃线程数
                threadPoolExecutor.getQueue().size()   //队列大小
        );
    }


    /**
     *@Description 重写ThreadPoolTaskExecutor的以下六个方法
     *@Param [task]
     *@Return void
     *@Author Mr.Chen
     *@Date 2022/4/20
     */
    @Override
    public void execute(Runnable task) {
        showThreadPoolInfo("1. do execute");
        super.execute(task);
    }

    @Override
    public void execute(Runnable task, long startTimeout) {
        showThreadPoolInfo("2. do execute");
        super.execute(task, startTimeout);
    }

    @Override
    public Future<?> submit(Runnable task) {
        showThreadPoolInfo("1. do submit");
        return super.submit(task);
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        showThreadPoolInfo("2. do submit");
        return super.submit(task);
    }

    @Override
    public ListenableFuture<?> submitListenable(Runnable task) {
        showThreadPoolInfo("1. do submitListenable");
        return super.submitListenable(task);
    }

    @Override
    public <T> ListenableFuture<T> submitListenable(Callable<T> task) {
        showThreadPoolInfo("2. do submitListenable");
        return super.submitListenable(task);
    }
}

