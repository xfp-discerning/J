package com.xfp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {
    @RequestMapping("/practice/h1")
    public String Hello(Model model){
        model.addAttribute("message","多个类");
        return "test";
    }
}
