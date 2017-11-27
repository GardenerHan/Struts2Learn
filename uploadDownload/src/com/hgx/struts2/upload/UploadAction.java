package com.hgx.struts2.upload;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

public class UploadAction extends ActionSupport {
    //多个文件上传
//    private File ppt ;
//    private  String pptContentType ;
//    private String pptFileName ;
//    private  String pptDesc ;
    private List<File> ppt ;
    private List<String> pptContentType ;
    private List<String> pptFileName ;
    private List<String> pptDesc ;


    @Override
    public String execute() throws Exception {
        System.out.println(this);
        ServletContext servletContext = ServletActionContext.getServletContext() ;
        FileOutputStream out = null;
        int list_len = ppt.size() ;
        FileInputStream in = null ;
        for (int i = 0;i < list_len ;i++){
            System.out.println("/file/"+pptFileName.get(i));
            String url = servletContext.getRealPath("/file/"+pptFileName.get(i)) ;
            out = new FileOutputStream(url) ;
            in = new FileInputStream(ppt.get(i)) ;
            byte[] buffer = new byte[1024] ;
            int len = 0 ;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
        }
        out.close();
        in.close();
        //return SUCCESS ;
        return INPUT ;
    }

    @Override
    public String toString() {
        return "UploadAction{" +
                "ppt=" + ppt +
                ", pptContentType=" + pptContentType +
                ", pptFileName=" + pptFileName +
                ", pptDesc=" + pptDesc +
                '}';
    }

    public UploadAction() {
    }

    public UploadAction(List<File> ppt, List<String> pptContentType, List<String> pptFileName, List<String> pptDesc) {
        this.ppt = ppt;
        this.pptContentType = pptContentType;
        this.pptFileName = pptFileName;
        this.pptDesc = pptDesc;
    }

    public List<File> getPpt() {
        return ppt;
    }

    public void setPpt(List<File> ppt) {
        this.ppt = ppt;
    }

    public List<String> getPptContentType() {
        return pptContentType;
    }

    public void setPptContentType(List<String> pptContentType) {
        this.pptContentType = pptContentType;
    }

    public List<String> getPptFileName() {
        return pptFileName;
    }

    public void setPptFileName(List<String> pptFileName) {
        this.pptFileName = pptFileName;
    }

    public List<String> getPptDesc() {
        return pptDesc;
    }
    public void setPptDesc(List<String> pptDesc) {
        this.pptDesc = pptDesc;
    }

    //    @Override
//    public String toString() {
//        return "UploadAction{"+"\n"+
//                "ppt=" + ppt +"\n"+
//                ", pptContentType='" + pptContentType + '\'' +"\n"+
//                ", pptFileName='" + pptFileName + '\'' +"\n"+
//                ", pptDesc='" + pptDesc + '\'' +
//                '}';
//    }

//    public File getPpt() {
//        return ppt;
//    }
//
//    public void setPpt(File ppt) {
//        this.ppt = ppt;
//    }
//
//    public String getPptContentType() {
//        return pptContentType;
//    }
//
//    public void setPptContentType(String pptContentType) {
//        this.pptContentType = pptContentType;
//    }
//
//    public String getPptFileName() {
//        return pptFileName;
//    }
//
//    public void setPptFileName(String pptFileName) {
//        this.pptFileName = pptFileName;
//    }
//


}
