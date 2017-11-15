package com.hgx.struts2.app;

import com.hgx.struts2.model.Industry;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class IndustryAction extends ActionSupport implements ModelDriven<Industry> {
    private  Industry industry ;
    @Override
    public String execute() throws Exception {
        System.out.println(industry);
        return SUCCESS;
    }

    @Override
    public Industry getModel() {
        industry = new Industry() ;
        return industry;
    }
}
