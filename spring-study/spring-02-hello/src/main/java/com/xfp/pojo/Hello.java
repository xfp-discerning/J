package com.xfp.pojo;

public class Hello {

    private String str;
    public Hello() {
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

    public Hello(String str) {
        this.str = str;
    }
}
