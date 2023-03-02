package com.xfp.pojo;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public User() {
//        System.out.println("调用了有参构造");
//    }


    public User(String name) {
        this.name = name;
    }

    public void show(){
         System.out.println("name="+name);
     }
}
