package com.xfp.mapper;

import com.xfp.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUser() {
        User user = new User(5,"占","222222");

        List<User> u = getSqlSession().getMapper(UserMapper.class).getUser();
        addUser(user);
        deleteUser(5);
        return u;
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
