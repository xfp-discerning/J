package com.xfp.dao;

import com.xfp.pojo.User;

        import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    //使用万能map使得数据库操作更容易,可以不用在xml中的名字一对一
    int addUser2(Map<String, Object> map);

    //模糊查询
    List<User> getUserLike(String value);
}
