package com.hgx.struts2.token;

import com.opensymphony.xwork2.ActionSupport;

public class TokenAction extends ActionSupport{
    private String username ;

    @Override
    public String execute() throws Exception {
        Thread.sleep(2000);
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
