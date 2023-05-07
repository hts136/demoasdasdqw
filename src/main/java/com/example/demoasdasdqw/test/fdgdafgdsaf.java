package com.example.demoasdasdqw.test;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fdgdafgdsaf {

    @Value("${web.redis.cluster.nodes}")
    private static String redisNodes;

    public static void main(String[] args) {


        System.out.println("1111");


        //   System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

//        ArrayList<Integer> list = new ArrayList<>();
//
//        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
//
//        List<Integer> collect = list.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);




//        list.add("张无忌-12-男");
//        list.add("周芷若-21-女");
//        list.add("张强-213-男");
//        list.add("张三丰-421-男");
//        list.add("李小宝-261-男");
//        list.add("赵敏-22-女");
//        ArrayList<String> list2 = new ArrayList<>();



//        for (String name:list){
//            System.out.print(name +" ");
//            String[] split = name.split("-");
//            System.out.println(Arrays.toString(split));
//            if (split[2].equals("男")){
//                list2.add(name);
//            }
//        }
//
//        System.out.println(list2);


//
//        System.out.println("----------------------");
//
//
//        list.stream().map(n->Integer.parseInt(n.split("-")[1])).forEach(n-> System.out.println(n));
//
//        System.out.println("----------------------");
//
//        list.stream().filter(name -> name.startsWith("张"))
//                .filter(name -> name.length() > 2)
//                .forEach(name-> System.out.println(name));

//        ArrayList<String> list1 = new ArrayList<>();
//
//        for(String name:list){
//            if (name.length()>2){
//                list1.add(name);
//            }
//        }
//        System.out.println(list1);

    }

}
