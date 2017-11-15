package com.hgx.struts2.i18n.app;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Date;

public class TestI18nAction extends ActionSupport {
    private  Date date ;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String execute() throws Exception {
        date = new Date() ;
        String username= getText("username") ;
        System.out.println(username);
        //带占位符的
        String time = getText("time", Arrays.asList(date)) ;
        System.out.println(time);
        return  SUCCESS ;

    }
}
