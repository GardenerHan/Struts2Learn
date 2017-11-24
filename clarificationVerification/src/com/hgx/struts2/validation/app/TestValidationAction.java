package com.hgx.struts2.validation.app;

import com.opensymphony.xwork2.ActionSupport;

public class TestValidationAction extends ActionSupport {
    private Integer age ;
    private String password ;
    private String password2 ;
    private Integer count ;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("this:"+this.toString());
        return  SUCCESS ;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public TestValidationAction(Integer age, String password, String password2, Integer count) {
        this.age = age;
        this.password = password;
        this.password2 = password2;
        this.count = count;
    }

    public TestValidationAction() {
    }

    @Override
    public String toString() {
        return "TestValidationAction{" +
                "age=" + age +
                ", password='" + password + '\'' +
                ", password2='" + password2 + '\'' +
                ", count=" + count +
                '}';
    }
}

