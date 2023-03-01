package com.xfp.utils;

import org.junit.Test;

import java.util.UUID;

//获取随机id
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    //需要去掉maven的xml中的scope限制
    @Test
    public void printUUID(){
        System.out.println(IDUtils.getId());
    }

}
