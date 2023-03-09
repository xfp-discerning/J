package com.xfp.controller;

import com.xfp.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")//方法main、mainPage同步使用，防止表单的重复提交
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName())&&StringUtils.hasLength(user.getPassword())){
            session.setAttribute("loginUser",user);
            return "redirect:main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }

    }
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
        Object attribute = session.getAttribute("loginUser");
        if(attribute != null){
            return "main";
        }else {
            model.addAttribute("msg","请重新登录");
            return "login";
        }
    }
}
