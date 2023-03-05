package com.xfp.mapper;

import com.xfp.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUser() {
        //getSqlSession()方法是SqlSessionDaoSupport自带的，用来获取SqlSession对象mapper的
        List<User> user = getSqlSession().getMapper(UserMapper.class).getUser();
        return user;
    }
}
