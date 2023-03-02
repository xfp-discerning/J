package com.xfp.demo02;

public class Client {
    public static void main(String[] args) {
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.add();
        UserServiceproxy userServiceproxy = new UserServiceproxy();
        userServiceproxy.setUserService(new UserServiceImpl());
        userServiceproxy.add();
    }
}
