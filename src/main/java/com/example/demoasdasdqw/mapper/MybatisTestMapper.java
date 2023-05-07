package com.example.demoasdasdqw.mapper;


import com.example.demoasdasdqw.pojo.Users;
import com.example.demoasdasdqw.util.Md5Utils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface MybatisTestMapper {


    Users selectByusername(@Param(value = "username") String username);



}
