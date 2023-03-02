package com.xfp.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    //@Autowired默认byType
    //@Autowired注解当注入容器存在多个同一类型的对象时，就是根据byName进行装配，
    // 当注入在IoC容器中该类型只有一个时，就通过byType进行装配
    // 也可以不编写set方法。
    //前提是自动装配的属性在IOC容器中已经存在
    //可以通过@Qualifier(value="")来显式的指定一个bean
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
