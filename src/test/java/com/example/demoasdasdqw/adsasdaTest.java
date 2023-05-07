package com.example.demoasdasdqw;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.LocalTaskExecutorThreadPool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class adsasdaTest {

    @Value("${redis.cluster.nodes}")
    private String secret;

    @Test
    public void dsadas(){
         List<Integer> strings = new ArrayList<>();
    //    HashMap<Integer, String> strings = new HashMap<>();
            System.out.println(strings);
    }

}
