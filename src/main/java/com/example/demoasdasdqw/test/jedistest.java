package com.example.demoasdasdqw.test;

import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.Random;

public class jedistest {

    public static void main(String[] args) {
//        Jedis jedis = new Jedis("192.168.200.130",6379);
//        jedis.flushDB();
//        String ping = jedis.ping();
//        System.out.println(ping);
//
//        jedis.set("libainame","libai");
//        System.out.println(jedis.get("libainame"));
//        System.out.println(jedis.keys("*"));

            String ophen ="12345";
            String code = verfiycode(ophen);
            System.out.println(code);
            if (!code.equals(null)){
                cheatRedisCode(ophen,code);
            }


    }

    public static void cheatRedisCode(String phone,String code){

        Jedis jedis = new Jedis("192.168.200.130",6379);

        String codeKey = "VerifyCode" + phone + ":code";

        String s = jedis.get(codeKey);
        if (code.equals(s)){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }

        jedis.close();
    }


    public static String verfiycode(String phone){

        Jedis jedis = new Jedis("192.168.200.130",6379);

        String countKey = "VerifyCode"+ phone +":count";//VerifyCode12345:count

        String codeKey = "VerifyCode" + phone + ":code";//VerifyCode12345:count

        String s = jedis.get(countKey);//null
        System.out.println(s);

        if (s==null){
            jedis.setex(countKey,24*60*60,"1");
        }else if (Integer.parseInt(s)<=2){
            jedis.incr(countKey);
        }else if(Integer.parseInt(s)>2){
            System.out.println("超3");
            jedis.close();
            return "超3";
        }

        String codeophen = Codeophen();
        jedis.setex(codeKey,60*60,codeophen);
        jedis.close();
        return jedis.get(codeKey);

    }

    public static String Codeophen(){
        Random random = new Random();
        String code ="";
        for (int i=0;i<6;i++){
            code += random.nextInt(10);
        }
        return code;
    }


}
