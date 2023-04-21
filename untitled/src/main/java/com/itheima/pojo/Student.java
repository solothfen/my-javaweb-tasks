package com.itheima.pojo;

public class Student {
    private int id;
    private int hourse;
    private String name;
    private int sid;

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", hourse=" + hourse +
                ", name='" + name + '\'' +
                ", sid=" + sid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHourse() {
        return hourse;
    }

    public void setHourse(int hourse) {
        this.hourse = hourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
