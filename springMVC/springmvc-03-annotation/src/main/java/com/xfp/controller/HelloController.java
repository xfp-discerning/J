package com.xfp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/h1")
    public String hello(Model model){
        model.addAttribute("msg","hello,Springmvc-annotation");
        return "hello"; //return返回值会被视图解析器处理，拼接成 WEB-INF/jsp/hello.jsp
    }
}
