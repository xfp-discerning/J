package com.xfp.diy;

//使用自定义切面实现AOP，只能使用cglib来进行代理
public class diyPointcut {
    public void before(){
        System.out.println("在方法前执行");
    }
    public void after(){
        System.out.println("在方法后执行");
    }
}
