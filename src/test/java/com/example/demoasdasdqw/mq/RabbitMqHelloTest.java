package com.example.demoasdasdqw.mq;

import com.example.demoasdasdqw.mq.scz.HelloSender;
import com.example.demoasdasdqw.util.Md5Utils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {

    }
}
