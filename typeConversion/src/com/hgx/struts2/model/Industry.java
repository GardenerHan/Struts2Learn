package com.hgx.struts2.model;

public class Industry {
    private int id  ;
    private  String name ;
    private Company cpy ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Company getCpy() {
        return cpy;
    }

    public void setCpy(Company cpy) {
        this.cpy = cpy;
    }

    public Industry() {
    }

    @Override
    public String toString() {
        return "Industry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpy=" + cpy +
                '}';
    }
}
