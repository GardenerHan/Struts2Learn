package com.hgx.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class InterceptorAction  extends ActionSupport{
    private  String username ;

    @Override
    public String execute() throws Exception {
        System.out.println(username);
        return super.execute();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
