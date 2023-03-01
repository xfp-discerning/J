package com.xfp.dao;

import com.xfp.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> getStudent();

    //第一种嵌套查询（子查询）
    List<Student> getStudentTeacher();

    //第二种查询方式
    List<Student> getStudentTeacher2();
}
