package org.example;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        Person person1 = new Person();
        System.out.println("学生的名字是"+person.name);
        //通过反射获取对象的方式
        //方法一
        Class c1 = person.getClass();
        Class c4 = person1.getClass();
        //方法二
        Class c2 = Class.forName("org.example.Student");
        //方法三
        Class c3 =Student.class;
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        Class c5 = c4.getSuperclass();
        System.out.println(c5);

    }

}

class Person{
    String name;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}

class Student extends Person{
    public Student() {
        this.name = "xfp";
    }
}

class Teacher extends  Person{
    public Teacher() {
        this.name = "老师";
    }
}
