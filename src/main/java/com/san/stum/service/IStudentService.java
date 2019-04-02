package com.san.stum.service;

import com.github.pagehelper.PageInfo;
import com.san.stum.common.Page;
import com.san.stum.entity.GtStudent;

public interface IStudentService {
	int deleteByPrimaryKey(Integer stuId);

	int insert(GtStudent record);

	int insertSelective(GtStudent record);

	GtStudent selectByPrimaryKey(Integer stuId);

	int updateByPrimaryKeySelective(GtStudent record);

	int updateByPrimaryKey(GtStudent record);

	PageInfo<GtStudent> queryPage(Page page);
}
