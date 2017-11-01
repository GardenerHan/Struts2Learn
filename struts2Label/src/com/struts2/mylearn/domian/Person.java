package com.struts2.mylearn.domian;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name ;
    private int age ;
    private  String sex ;
    private List<Student>  list = new ArrayList<>();

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Person(){

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String dosit(){
        name = "傻逼了吧" ;
        age =  20;
        sex = "未知" ;
        list.add(new Student("小明",12))  ;
        list.add(new Student(("小寒"),10)) ;
        list.add(new Student("小白",13));
        list.add(new Student("小张",9)) ;
        list.add(new Student("小猪",16)) ;
        return "success" ;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
