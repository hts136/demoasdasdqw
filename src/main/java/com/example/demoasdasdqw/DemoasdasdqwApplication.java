package com.example.demoasdasdqw;

import com.example.demoasdasdqw.config.TaskThreadPoolConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync //开启异步支持
@EnableConfigurationProperties({TaskThreadPoolConfig.class})
@SpringBootApplication
@MapperScan("com.example.demoasdasdqw.mapper")
public class DemoasdasdqwApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoasdasdqwApplication.class, args);
    }

}
