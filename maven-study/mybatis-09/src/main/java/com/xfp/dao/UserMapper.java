package com.xfp.dao;

import com.xfp.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User queryUserById(@Param("id")int i );
}
