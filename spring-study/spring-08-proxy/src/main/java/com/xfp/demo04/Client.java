package com.xfp.demo04;

import com.xfp.demo02.UserService;
import com.xfp.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真是角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler proxyInvocationHandler  = new ProxyInvocationHandler();
        //设置要代理的对象
        proxyInvocationHandler.setTarget(userService);
        //获取动态代理类实例
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.add();
        proxy.delete();
    }
}
