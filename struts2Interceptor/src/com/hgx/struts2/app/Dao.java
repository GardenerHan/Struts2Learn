package com.hgx.struts2.app;

import java.util.*;

public class Dao {
    public static Map<Integer,Employeee> emp = new LinkedHashMap<>() ;

    static {
        emp.put(1001,new Employeee(1001,"AA","aa","aa@hgx.com")) ;
        emp.put(1002,new Employeee(1002,"BB","bb","bb@hgx.com")) ;
        emp.put(1003,new Employeee(1003,"CC","cc","cc@hgx.com")) ;
        emp.put(1004,new Employeee(1004,"DD","dd","dd@hgx.com")) ;
        emp.put(1005,new Employeee(1005,"EE","ee","ee@hgx.com")) ;


    }

    public static List<Employeee> getEmployees(){
        return new ArrayList<>(emp.values()) ;
    }
    public static void delete(Integer empId){
        emp.remove(empId) ;
    }
    public static void save(Employeee employeee){
        long time = System.currentTimeMillis() ;
        employeee.setEmployeeId(Math.abs((int) time));
        emp.put(employeee.getEmployeeId(),employeee) ;
    }
    public static  Employeee get(Integer empId){
        return emp.get(empId) ;
    }
    public static void update(Employeee employeee){
        emp.put(employeee.getEmployeeId(),employeee) ;
    }



}
