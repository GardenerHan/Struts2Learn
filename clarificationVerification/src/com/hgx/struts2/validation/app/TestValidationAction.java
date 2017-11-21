package com.hgx.struts2.validation.app;

import com.opensymphony.xwork2.ActionSupport;

public class TestValidationAction extends ActionSupport {
    private int age ;
    private String password ;
    private String password2 ;

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

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public TestValidationAction(int age, String password, String password2) {
        this.age = age;
        this.password = password;
        this.password2 = password2;
    }

    public TestValidationAction() {
    }

    @Override
    public String toString() {
        return "TestValidationAction{" +
                "age=" + age +
                ", password='" + password + '\'' +
                ", password2='" + password2 + '\'' +
                '}';
    }
}
