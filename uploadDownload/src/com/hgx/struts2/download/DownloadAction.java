package com.hgx.struts2.download;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.FileInputStream;
import java.io.InputStream;

public class DownloadAction extends ActionSupport {
    private String contentType;
    private long contentLength;
   // private String contentDisposition ;
    private InputStream inputStream;

    public String getContentType() {
        return contentType;
    }

    public long getContentLength() {
        return contentLength;
    }

//    public String getContentDisposition() {
//        return contentDisposition;
//    }

    public InputStream getInputStream() {
        return inputStream;
    }

    @Override
    public String execute() throws Exception {

        //确定各个成员变量的值
        contentType = "text/html";
//        struts2.5这样用貌似attachment不起作用
//        contentDisposition = "attachment;fileName=hidden.html" ;
        ServletContext servletContext =
                ServletActionContext.getServletContext();
        String fileName = servletContext.getRealPath("/file/hidden.html");
        inputStream = new FileInputStream(fileName);
        contentLength = inputStream.available();

        return SUCCESS;
    }
}
