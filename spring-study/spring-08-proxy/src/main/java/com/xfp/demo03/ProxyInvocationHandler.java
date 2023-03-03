package com.xfp.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    //newProxyInstance中的第一个参数和第三个参数：由于代理和InvocationHandler在同一类中，所以都传的this
    public Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    //处理代理实例并返回代理结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent, args);
        return result;
    }
    public void seeHouse(){
        System.out.println("看了房子");
    }
}
