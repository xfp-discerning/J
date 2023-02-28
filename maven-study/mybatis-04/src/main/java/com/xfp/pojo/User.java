package com.xfp.pojo;

//实体类
//@Alias("user")//别名
public class User {
    private int id;
    private String name;

    //当字段名和数据库表明不一致时，将读不出这个字段的内容
    //解决办法一、select id,name,pwd as password from mybatis.user where id = #{id};
    //解决办法二、使用ResultMap，见UserMapper.xml
    private  String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //很重要
    public User() {
    }

    public String getPassword() {
        return password;
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
