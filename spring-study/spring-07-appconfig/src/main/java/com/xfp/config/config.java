package com.xfp.config;

import com.xfp.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public User getUser(){
        User user = new User();
        user.setName("xfp大王");
        return user;
    }
}
