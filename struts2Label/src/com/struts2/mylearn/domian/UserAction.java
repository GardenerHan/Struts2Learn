package com.struts2.mylearn.domian;

public class UserAction {
    private String userId ;
    private  String userName ;
    private  String desc ;
    private  String password ;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public  String save(){
        System.out.println(this);
        return "input" ;
    }

    @Override
    public String toString() {
        return "UserAction{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", desc='" + desc + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
