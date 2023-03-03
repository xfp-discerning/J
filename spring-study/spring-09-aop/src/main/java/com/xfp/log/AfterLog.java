package com.xfp.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

//方法一，spring api实现，使用原生JDK
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法，返回结果:"+returnValue);
    }
}
