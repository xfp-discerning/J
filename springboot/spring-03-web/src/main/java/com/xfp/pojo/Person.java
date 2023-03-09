package com.xfp.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private int age;
    private String gender;

public Person(String name, int age, String gender, String[] hobby) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.hobby = hobby;
}

public Person() {
}

@Override
public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", gender='" + gender + '\'' +
            ", hobby=" + Arrays.toString(hobby) +
            '}';
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getGender() {
    return gender;
}

public void setGender(String gender) {
    this.gender = gender;
}

public String[] getHobby() {
    return hobby;
}

public void setHobby(String[] hobby) {
    this.hobby = hobby;
}

private String[] hobby;
}
