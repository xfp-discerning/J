package com.xfp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncoderController {

    //过滤器解决乱码
    @PostMapping("/encoder")
    public String encoder(String name, Model model){
        model.addAttribute("message",name);
        return "test";
    }
}
