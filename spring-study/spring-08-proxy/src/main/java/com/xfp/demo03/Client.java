package com.xfp.demo03;

public class Client {
    public static void main(String[] args) {
        LandLord landLord = new LandLord();
        ProxyInvocationHandler proxyInvocationHandler= new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(landLord);
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.Rent();
    }
}
