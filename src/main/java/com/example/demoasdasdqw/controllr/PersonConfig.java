package com.example.demoasdasdqw.controllr;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonConfig {

    @Value("${redis.cluster.nodes}")
    private String secret;

    @RequestMapping("/rest")
    public String rest(){
        System.out.println(secret);
        return secret;
    }


}
