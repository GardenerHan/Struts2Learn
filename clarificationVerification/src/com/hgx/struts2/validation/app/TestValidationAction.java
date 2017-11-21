package com.hgx.struts2.validation.app;

import com.opensymphony.xwork2.ActionSupport;

public class TestValidationAction extends ActionSupport {
    private int age ;

    @Override
    public String execute() throws Exception {
        System.out.println("age:"+age);
        return  SUCCESS ;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public TestValidationAction(int age) {
        this.age = age;
    }

    public TestValidationAction() {
    }

    @Override
    public String toString() {
        return "TestValidationAction{" +
                "age=" + age +
                '}';
    }
}
