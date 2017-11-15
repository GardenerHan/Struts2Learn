package com.hgx.struts2.app.converters;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.StrutsTypeConverter;

import javax.servlet.ServletContext;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class DateConverter extends StrutsTypeConverter {
    private DateFormat dateFormat ;

    public DateConverter() {
        System.out.println("DateConversion construction");
    }
    public DateFormat getDateformat(){
        if (dateFormat == null) {
            ServletContext servletContext = ServletActionContext.getServletContext();
            dateFormat = new SimpleDateFormat(servletContext.getInitParameter("patten"));


        }
        return dateFormat ;
    }

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        System.out.println("convertFromString");
        if (aClass == Date.class)
            if (strings != null && strings.length > 0){
                String value = strings[0] ;
                try {
                    return getDateformat().parseObject(value) ;
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            return strings;
    }

    @Override
    public String convertToString(Map map, Object o) {
        System.out.println("convertToString....");
        if (o instanceof Date){
            Date date = (Date) o;
            return dateFormat.format(date) ;
        }
        return  null ;
    }
}
