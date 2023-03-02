package com.xfp.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

//    @Value("xfp大王")
    public void setName(String name) {
        this.name = name;
    }
}
