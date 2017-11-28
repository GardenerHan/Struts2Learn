package com.hgx.struts2.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptors extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("before invocation.invoke()");
        String result = actionInvocation.invoke() ;//将控制权给action invocation
        System.out.println("after invocation.invoke()");
        return result;
    }
}
