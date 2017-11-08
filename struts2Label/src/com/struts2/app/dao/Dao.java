package com.struts2.app.dao;

import com.struts2.app.main.Department;
import com.struts2.app.main.Role;

import java.util.ArrayList;
import java.util.List;

public class Dao {
   public List<Department> getDepartment(){
       List<Department> list = new ArrayList<>() ;
       list.add(new Department(1000,"AAA")) ;
       list.add(new Department(1002,"BBB")) ;
       list.add(new Department(1003,"CCC")) ;
       return list ;
   }
   public  List<Role> getRole(){
       List<Role> list = new ArrayList<>() ;
       list.add(new Role(2001,"XXX")) ;
       list.add(new Role(2002,"YYY")) ;
       list.add(new Role(2003,"ZZZ")) ;
       return list ;
   }

}
