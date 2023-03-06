package com.xfp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xfp.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody//加上这个注解，它就不会经过视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //创建一个对象
        //User user = new User(24,"徐发鹏","male");不作其他处理中文会乱码
        ObjectMapper mapper = new ObjectMapper();
        User user = new User(24,"徐发鹏","male");
        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/j2")
    @ResponseBody//加上这个注解，它就不会经过视图解析器，会直接返回一个字符串
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user1 = new User(24,"徐发鹏","male");
        User user2 = new User(23,"xxx","male");
        User user3 = new User(22,"汪洋","male");
        User user4 = new User(21,"陈王","male");
        User user5 = new User(20,"徐水英","female");
        List<User> user = new ArrayList<User>();
        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);
        user.add(user5);
        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/j3")
    @ResponseBody//加上这个注解，它就不会经过视图解析器，会直接返回一个字符串
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Date date = new Date();
        //不使用SimpleDateFormat，将默认timestamp（时间戳）的方式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = mapper.writeValueAsString(sdf.format(date));
        return s;
    }

}
