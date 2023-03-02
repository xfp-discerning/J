package com.xfp.service;

import com.xfp.dao.UserDao;
import com.xfp.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    //普通用法
//    private UserDao userDao = new UserDaoImpl();
//    @Override
//    public void getUser() {
//        userDao.getUser();
//    }

    //IOC
    private UserDao userDao;
    //set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
