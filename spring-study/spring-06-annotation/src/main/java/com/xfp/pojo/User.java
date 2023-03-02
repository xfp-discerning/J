package com.xfp.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//等价于<bean id ="user" class = "com.xfp.pojo.User"/>
public class User {
    @Value("xfp")
    private String name;

    public String getName() {
        return name;
    }
}
