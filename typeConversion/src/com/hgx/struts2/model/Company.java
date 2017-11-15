package com.hgx.struts2.model;

import java.util.Date;

public class Company {
    private  String name ;
    private Date birth ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Company(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public Company() {
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
