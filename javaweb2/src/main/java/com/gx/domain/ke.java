package com.gx.domain;
import java.io.Serializable;


public class ke implements Serializable{

    private String ke_name;

    private Integer ke_time;

    private String school;

    public String getKe_name() {
        return ke_name;
    }

    public Integer getKe_time() {
        return ke_time;
    }

    public String getSchool() {
        return school;
    }

    public void setKe_name(String ke_name) {
        this.ke_name = ke_name;
    }

    public void setKe_time(Integer ke_time) {
        this.ke_time = ke_time;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "ke{" +
                "ke_name='" + ke_name + '\'' +
                ", ke_time=" + ke_time +
                ", school='" + school + '\'' +
                '}';
    }
}
