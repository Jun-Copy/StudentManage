package com.san.stum.entity;

public class GtTeacher {
    private Integer teaId;

    private String teaName;

    private String teaSex;

    private String teaDescribe;

    private Integer clId;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex == null ? null : teaSex.trim();
    }

    public String getTeaDescribe() {
        return teaDescribe;
    }

    public void setTeaDescribe(String teaDescribe) {
        this.teaDescribe = teaDescribe == null ? null : teaDescribe.trim();
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }
}