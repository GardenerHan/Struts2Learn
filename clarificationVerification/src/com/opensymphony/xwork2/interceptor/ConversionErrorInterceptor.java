package com.opensymphony.xwork2.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.conversion.impl.XWorkConverter;
import com.opensymphony.xwork2.util.ValueStack;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringEscapeUtils;

public class ConversionErrorInterceptor extends MethodFilterInterceptor {
    public static final String ORIGINAL_PROPERTY_OVERRIDE = "original.property.override";

    public ConversionErrorInterceptor() {
    }

    protected Object getOverrideExpr(ActionInvocation invocation, Object value) {
        return this.escape(value);
    }

    protected String escape(Object value) {
        return "\"" + StringEscapeUtils.escapeJava(String.valueOf(value)) + "\"";
    }

    public String doIntercept(ActionInvocation invocation) throws Exception {
        ActionContext invocationContext = invocation.getInvocationContext();
        Map<String, Object> conversionErrors = invocationContext.getConversionErrors();
        ValueStack stack = invocationContext.getValueStack();
        HashMap<Object, Object> fakie = null;
        Iterator i$ = conversionErrors.entrySet().iterator();

        while(i$.hasNext()) {
            Entry<String, Object> entry = (Entry)i$.next();
            String propertyName = (String)entry.getKey();
            Object value = entry.getValue();
            if (this.shouldAddError(propertyName, value)) {
                String message = XWorkConverter.getConversionErrorMessage(propertyName, stack);
                Object action = invocation.getAction();
                if (action instanceof ValidationAware) {
                    ValidationAware va = (ValidationAware)action;
                    va.addFieldError(propertyName, message);
                }

                if (fakie == null) {
                    fakie = new HashMap();
                }

                fakie.put(propertyName, this.getOverrideExpr(invocation, value));
            }
        }

        if (fakie != null) {
            stack.getContext().put("original.property.override", fakie);
            invocation.addPreResultListener((invocation1, resultCode) -> {
                Map<Object, Object> fakie1 = (Map) invocation1.getInvocationContext().get("original.property.override");
                if (fakie1 != null) {
                    invocation1.getStack().setExprOverrides(fakie1);
                }

            });
        }
        //如果转换失败，直接返回
        //不再执行后续的验证拦截器，而且返回input的result
        Object action = invocation.getAction();
        if (action instanceof ValidationAware) {
            ValidationAware va = (ValidationAware)action;
           if (va.hasFieldErrors()){
               return "input" ;
           }
        }
        return invocation.invoke();
    }

    protected boolean shouldAddError(String propertyName, Object value) {
        return true;
    }
}
