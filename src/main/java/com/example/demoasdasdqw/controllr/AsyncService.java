package com.example.demoasdasdqw.controllr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author HO
 * @Package com.zhitu.thread.service
 * @Description
 * @Date 2020/8/5 10:58
 * @Version 1.0.0
 */
@Service
public class AsyncService {

    protected static final Logger logger = LoggerFactory.getLogger(AsyncService.class);

    @Async("myTaskAsyncPool")//myTaskAsyncPool为线程池配置类里面的方法，如果使用@Value注解读取配置，则应该改为asyncServiceExecutor（同上面代码的方法名称，可以往上查看）
    public void executeAsync() {
        logger.info("start AsyncService");
        try {
            //逻辑操作
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("end AsyncService");
    }
}


