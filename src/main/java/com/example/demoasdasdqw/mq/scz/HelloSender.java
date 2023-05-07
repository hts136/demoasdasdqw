package com.example.demoasdasdqw.mq.scz;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    public void send(){
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String contest = "hello"+date;
        this.rabbitmqTemplate.convertAndSend("q_hello",contest);
    }


}
