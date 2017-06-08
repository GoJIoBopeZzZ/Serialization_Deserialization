package com.red;

import java.io.Serializable;

/**
 * Created by _red_ on 08.06.17.
 */
public class Student implements Serializable{
    private String name;
    private String surName;
    private Integer age;

    public Student(String name, String surName, Integer age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
