package com.san.stum.service;

import com.san.stum.entity.GtTeacher;

import java.util.List;

public interface ITeacherService{
    int deleteByPrimaryKey(Integer teaId);

    int insert(GtTeacher record);

    int insertSelective(GtTeacher record);

    GtTeacher selectByPrimaryKey(Integer teaId);

    int updateByPrimaryKeySelective(GtTeacher record);

    int updateByPrimaryKey(GtTeacher record);

    List<GtTeacher> queryTeacher();
}
