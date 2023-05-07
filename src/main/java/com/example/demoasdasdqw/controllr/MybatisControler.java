package com.example.demoasdasdqw.controllr;

import com.example.demoasdasdqw.mapper.MybatisTestMapper;
import com.example.demoasdasdqw.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
public class MybatisControler {

    @Autowired
    MybatisTestMapper mybatisTestMapper;


    @RequestMapping("/mytest")
    public Users mybatisTestMappertest(){

        Users luyc = mybatisTestMapper.selectByusername("lucy");
        System.out.println(luyc);

        return luyc;

    }



}
