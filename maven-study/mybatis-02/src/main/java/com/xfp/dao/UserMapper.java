package com.xfp.dao;

import com.xfp.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //通过ID查
    User getUserById(int id);

    //添加用户
    int addUser(User user);

    //更新用户信息
    int updateUser(User user);

    //删除用户
    int deletUser(int id);
}
