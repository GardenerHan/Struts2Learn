package com.struts2.app.main;

import com.struts2.app.dao.Dao;
import org.apache.struts2.interceptor.RequestAware;

import java.util.List;
import java.util.Map;

public class Employee implements RequestAware {

    private Map<String, Object> requestMap = null ;
    private Dao dao = new Dao() ;
    private String name ;
    private String password ;
    private String gender ;
    private String dept ;
    private List<String> roles ;
    private String desc ;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passwold) {
        this.password = passwold;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String save(){
       System.out.println(this);
       return "save" ;
   }
   public String input(){
       requestMap.put("depts",dao.getDepartment()) ;
       requestMap.put("roles",dao.getRole()) ;
       return "input" ;
   }

    @Override
    public void setRequest(Map<String, Object> map) {
        requestMap = map ;
        System.out.println("requestMap:"+requestMap);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                ", roles=" + roles +
                ", desc='" + desc + '\'' +
                '}';
    }
}
