package com.xfp.controller;

import com.xfp.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ControllerTest {
    @RequestMapping("/test")
    public String test1(HttpServletRequest req , HttpServletResponse rsp){
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        return "test";
    }

    @RequestMapping("/t1")
    public String test2(User user) {
        System.out.println(user);
        return "test";
    }
}
