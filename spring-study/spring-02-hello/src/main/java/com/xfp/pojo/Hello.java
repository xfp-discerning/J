package com.xfp.pojo;

public class Hello {

    private String str;
    public Hello() {
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

    public void setStr(String str) {
        this.str = str;
    }
}
