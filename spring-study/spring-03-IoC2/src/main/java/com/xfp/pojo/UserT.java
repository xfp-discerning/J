package com.xfp.pojo;

public class UserT {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserT() {
        System.out.println("UserT被创建了");
    }
}
