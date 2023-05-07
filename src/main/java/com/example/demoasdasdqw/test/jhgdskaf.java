package com.example.demoasdasdqw.test;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demoasdasdqw.pojo.User;
import com.example.demoasdasdqw.util.Md5Utils;
import org.springframework.context.annotation.Bean;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class jhgdskaf {


    public static void main(String[] args) {

//        String hello="hello";
//
//        String aklsjh = aklsjhd(hello);
//        System.out.println(aklsjh);//olleh

        User user = new User();
        user.setAge(12);
        user.setId(123);
        user.setName("libai");

        String dd = JSON.toJSONString(user);
        System.out.println(dd);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(simpleDateFormat.format(date));


    }



    public static String aklsjhd(String a){

        if (a==null||a.length()<=1){
            return a;
        }

        return aklsjhd(a.substring(1))+a.charAt(0);
    }

}
