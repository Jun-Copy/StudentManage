package com.san.stum.mapper;

import com.san.stum.entity.GtTeacher;

public interface GtTeacherMapper {
    int deleteByPrimaryKey(Integer teaId);

    int insert(GtTeacher record);

    int insertSelective(GtTeacher record);

    GtTeacher selectByPrimaryKey(Integer teaId);

    int updateByPrimaryKeySelective(GtTeacher record);

    int updateByPrimaryKey(GtTeacher record);
}