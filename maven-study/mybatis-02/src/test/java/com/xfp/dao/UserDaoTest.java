package com.xfp.dao;

import com.xfp.pojo.User;
import com.xfp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步，获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步，执行sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();

    }

    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int num = mapper.addUser(new User(4, "王阳", "12345"));
        if (num>0)
        {
            System.out.println("提交成功");
        }
        //重要
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int num = mapper.updateUser(new User(1, "英姨", "12345"));
        if (num>0)
        {
            System.out.println("提交成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deletUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deletUser(1);
        sqlSession.commit();
        sqlSession.close();
    }
}
