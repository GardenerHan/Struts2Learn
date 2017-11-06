package com.struts2.mylearn.domian;

import java.util.Arrays;

public class UserAction {
    private String userId ;
    private  String userName ;
    private  String desc ;
    private  String password ;
    private  boolean married;
    private  String gender ;
    private  String[] cities;
    private  String age ;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public  String save(){
        System.out.println(this);
        return "input" ;
    }

    public UserAction() {
    }

    @Override
    public String toString() {
        return "UserAction{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", desc='" + desc + '\'' +
                ", password='" + password + '\'' +
                ", married=" + married +
                ", gender='" + gender + '\'' +
                ", cities=" + Arrays.toString(cities) +
                ", age='" + age + '\'' +
                '}';
    }
}
