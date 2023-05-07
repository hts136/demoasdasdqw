package com.example.demoasdasdqw.controllr;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.HashMap;

import static com.example.demoasdasdqw.util.Md5Utils.MD5Encode;

/**
 * @Author HO
 * @Package com.zhitu.thread.controller
 * @Description
 * @Date 2020/8/5 11:03
 * @Version 1.0.0
 */
@RestController
public class AsyncController {

    protected static final Logger LOGGER = LoggerFactory.getLogger(AsyncController.class);

    @Autowired
    private AsyncService asyncService;


    @RequestMapping("/")
    public String submit(HttpServletRequest request, HttpServletResponse response) {
        LOGGER.info("start submit");
        //调用service
        this.asyncService.executeAsync();
        //调用结束 打印日志
        LOGGER.info("end submit");


        HttpSession session = request.getSession();
        String id = session.getId();
        Cookie cookie = new Cookie("nn",id);
        System.out.println(id);
        Cookie cookie2 = new Cookie("nn","sdasdasdsad");
        response.addCookie(cookie);
        response.addCookie(cookie2);
        String aa = "12312";


        String ss = MD5Encode(aa, "utf-8", false);
        System.out.println("ss ="+ss);
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("11","22");
        System.out.println(hashMap);

        return "success";
    }

}

