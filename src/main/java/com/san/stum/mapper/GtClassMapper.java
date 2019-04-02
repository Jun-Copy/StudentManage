package com.san.stum.mapper;

import com.san.stum.entity.GtClass;

import java.util.List;

public interface GtClassMapper {
    int deleteByPrimaryKey(Integer clId);

    int insert(GtClass record);

    int insertSelective(GtClass record);

    GtClass selectByPrimaryKey(Integer clId);

    int updateByPrimaryKeySelective(GtClass record);

    int updateByPrimaryKey(GtClass record);

    List<GtClass> selectByCondition(GtClass gtClass);
}