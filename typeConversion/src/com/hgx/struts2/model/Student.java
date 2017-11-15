package com.hgx.struts2.model;

import java.util.Date;

public class Student {
    private int age;
    private Date bith ;

    public void setBith(Date bith) {
        this.bith = bith;
    }

    public Date getBith() {
        return bith;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", bith=" + bith +
                '}';
    }
}
