package com.example.demoasdasdqw.controllr;


import com.example.demoasdasdqw.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Rdsadh {

    @RequestMapping("/test")
    public String dasda(HttpServletRequest request, HttpServletResponse response){
        return "success";
    }

    @RequestMapping("/post")
    public void aksldn(@RequestBody User user){
        System.out.println("*****************");
        System.out.println(user.toString());
        System.out.println("sdasd");
    }


}
