package com.xfp.demo02;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("实现了增");
    }

    @Override
    public void delete() {
        System.out.println("实现了删");
    }

    @Override
    public void update() {
        System.out.println("实现了改");

    }

    @Override
    public void query() {
        System.out.println("实现了查");
    }
}
