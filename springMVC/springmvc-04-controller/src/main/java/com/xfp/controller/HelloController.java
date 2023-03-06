package com.xfp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/practice")
    public String Hello(Model model){
        model.addAttribute("message","练习成功");
        return "test";
    }

    //http://localhost:8080/springmvc/add?a=1&b=2
    //restful风格
//    @RequestMapping("/add")
//    @RequestMapping("/add/{a}/{b}")
    @GetMapping("/add/{a}/{b}")
    public String add1(@PathVariable int a,@PathVariable int b , Model model){
        int res = a+b;
        model.addAttribute("message","结果为"+res);
        return "test";
    }
    @PostMapping ("/add/{a}/{b}")
    public String add2(@PathVariable int a,@PathVariable int b , Model model){
        int res = a+b;
        model.addAttribute("message","结果为"+res);
        return "test";
    }
}
