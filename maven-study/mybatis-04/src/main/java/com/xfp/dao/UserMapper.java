package com.xfp.dao;

import com.xfp.pojo.User;

public interface UserMapper {
    //通过ID查
    User getUserById(int id);
}
