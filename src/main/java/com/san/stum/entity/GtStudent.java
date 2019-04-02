package com.san.stum.entity;

public class GtStudent {
    private Integer stuId;

    private String stuName;

    private String stuSex;

    private String stuDescribe;

    private Integer clId;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuDescribe() {
        return stuDescribe;
    }

    public void setStuDescribe(String stuDescribe) {
        this.stuDescribe = stuDescribe == null ? null : stuDescribe.trim();
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }
}