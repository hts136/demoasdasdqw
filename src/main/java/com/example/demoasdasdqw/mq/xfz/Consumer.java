package com.example.demoasdasdqw.mq.xfz;

import com.rabbitmq.client.*;

import java.io.IOException;

public class Consumer {

    public static void main(String[] args) throws Exception {

        String xc_name = "xc_name";
        String name_ex = "name_ex";

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.200.130");
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setPort(5673);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        DeliverCallback deliverCallback=(cousumerTage, message)->{
            System.out.println("success"+" "+new String(message.getBody()));
            if (new String(message.getBody()).equals("message")){
                System.out.println("11111111111111");
            }
        };
        CancelCallback cancelCallback=(cousumerTage)->{
            System.out.println("false");
        };

        /**
         *消费消息
         * 1.消费哪个队列
         * 2.消费成功之后是含需要自动应答，true: 自动应答
         * 3.接受消息的回调的数
         * 4.取消消息的回调函数
         */
        channel.basicConsume("xc_name",true,deliverCallback,cancelCallback);


    }
}
