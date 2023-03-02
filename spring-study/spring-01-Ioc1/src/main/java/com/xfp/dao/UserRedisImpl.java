package com.xfp.dao;

public class UserRedisImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取了Redis数据");
    }
}
