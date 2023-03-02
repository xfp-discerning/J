package com.xfp.demo01;

//租客
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new LandLord());
        proxy.Rent();
    }
}
