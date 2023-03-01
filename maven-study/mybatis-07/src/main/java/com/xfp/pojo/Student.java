package com.xfp.pojo;

//@Alias("student")
public class Student {
    private int id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tid=" + tid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Student(int id, String name, int tid) {
        this.id = id;
        this.name = name;
        this.tid = tid;
    }

    public Student() {
    }

    private String name;
    //学生需要关联一个老师
    private int tid;
}
