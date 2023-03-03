package com.xfp.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//目的是使用方式三：使用注解方式实现AOP
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.xfp.service.UserServiceImpl.*(..))")//里面写入切入点
    public void Before(){
        System.out.println("方法===========执行前");
    }

    @After("execution(* com.xfp.service.UserServiceImpl.*(..))")
    public void After(){
        System.out.println("方法===========执行后");
    }
    @Around("execution(* com.xfp.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint Jp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = Jp.proceed();
        System.out.println("环绕后");
    }
}
