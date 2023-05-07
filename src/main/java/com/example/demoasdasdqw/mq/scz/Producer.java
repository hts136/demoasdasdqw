package com.example.demoasdasdqw.mq.scz;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

public class Producer {

    public static void main(String[] args) throws Exception {


        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.200.130");
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setPort(5673);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();


        /**
         * 创建交换机
         * 1.交换机名称
         * 2.交换机类型，direct,topic,fanout和headers
         * 3.指定交换机是否需要持久化，如果设置为rue，那么交换机的元数据要持久化
         * 4.指定交换机在没有队列绑定时，是否需要删除，设置false .表示不侧除
         * 5.Map<String，obect>类型，用来指定我们交换机其他的，些机构化参数，我们在这里直接设置成nuLL
         */
        channel.exchangeDeclare("name_ex", BuiltinExchangeType.DIRECT,true,false,null);

        /**
         * 生成一个队列
         * 1.队列名称
         * 2.队列是否需要持久化，但是要注意，这里的持久化只是队列名称等这些元数据的持久化，不是队列中消息的持久化
         * 3。表示队列是不是私有的，如果是私有的，只有创建他的应用程序才能消费消息
         * 4。队列在没有消费者订阅的情况下是否自动酬除
         * 5.队列的一些结构化信息，比如声明死信队列，磁盘队列会用到
         */
        channel.queueDeclare("xc_name",true,false,false,null);

        /**
         * 绑定交换机和队列
         * 1.队列
         * 2。交换机
         * 3.路由键，在直连模式下可以为队列名称
         */
        channel.queueBind("xc_name","name_ex","xc_name");

        /**
         * 发送消息
         * 1发送到哪个交换机
         * 2.队列名称
         * 3.其他参数信息
         * 4.发送消息的消息体
         */
        channel.basicPublish("name_ex","xc_name",null,"message".getBytes());


        channel.close();
        connection.close();


    }



}
