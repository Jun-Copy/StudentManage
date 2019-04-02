package com.san.stum.mapper;

import com.san.stum.entity.GtStudent;

import java.util.List;

public interface GtStudentMapper {
    int deleteByPrimaryKey(Integer stuId);

    int insert(GtStudent record);

    int insertSelective(GtStudent record);

    GtStudent selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(GtStudent record);

    int updateByPrimaryKey(GtStudent record);

	List<GtStudent> queryPage();
}