package com.xfp.dao;

import com.xfp.pojo.User;

import java.util.List;

public interface UserMapper {
    //通过ID查
    User getUserById(int id);
}
