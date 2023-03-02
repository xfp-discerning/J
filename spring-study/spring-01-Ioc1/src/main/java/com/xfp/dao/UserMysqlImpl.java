package com.xfp.dao;

public class UserMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取了Mysql数据");
    }
}
