package com.xfp.dao;

import com.xfp.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //通过ID查
    User getUserById(@Param("id") int id);

    //分页功能
    List<User> getUserByLimit(Map<String,Integer> map);
}
