package com.hgx.struts2.app;

import com.hgx.struts2.model.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ConversionAction extends ActionSupport implements ModelDriven<Student> {
        private  Student model ;

    public String execute() {

        System.out.println("student:"+model);
        return "success";
    }


    public ConversionAction() {
    }


    @Override
    public Student getModel() {
     model = new Student() ;
     return model ;
    }
}