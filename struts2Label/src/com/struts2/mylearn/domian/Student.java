package com.struts2.mylearn.domian;

public class Student {
    private String stundentName ;
    private  int age ;

    public String getStundentName() {
        return stundentName;
    }

    public void setStundentName(String stundentName) {
        this.stundentName = stundentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String stundentName, int age) {
        this.stundentName = stundentName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stundentName='" + stundentName + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }
}
