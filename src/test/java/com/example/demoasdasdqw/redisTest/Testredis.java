package com.example.demoasdasdqw.redisTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@SpringJUnitConfig()
@SpringBootTest
public class Testredis {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void keytypetest(){

        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("name","libai");
        System.out.println(valueOperations.get("name"));

    }

}
