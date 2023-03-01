package com.xfp.dao;

import com.xfp.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    //获取老师
    Teacher getTeacher(@Param("tid") int i);

    //获取老师下面的学生，按结果查询
     Teacher getTeacherStu(@Param("tid") int i);

     //嵌套查询
    Teacher getTeacherStu2(@Param("tid") int i);
}
