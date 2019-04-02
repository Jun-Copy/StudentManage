package com.san.stum.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.san.stum.common.Page;
import com.san.stum.entity.GtStudent;
import com.san.stum.mapper.GtStudentMapper;
import com.san.stum.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private GtStudentMapper studentMapper;

	@Override
	public int deleteByPrimaryKey(Integer stuId) {
		return studentMapper.deleteByPrimaryKey(stuId);
	}

	@Override
	public int insert(GtStudent record) {
		return studentMapper.insert(record);
	}

	@Override
	public int insertSelective(GtStudent record) {
		return studentMapper.insertSelective(record);
	}

	@Override
	public GtStudent selectByPrimaryKey(Integer stuId) {
		return studentMapper.selectByPrimaryKey(stuId);
	}

	@Override
	public int updateByPrimaryKeySelective(GtStudent record) {
		return studentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(GtStudent record) {
		return studentMapper.updateByPrimaryKey(record);
	}

	@Override
	public PageInfo<GtStudent> queryPage(Page page) {
		PageHelper.startPage(page.getCurrentPage(),page.getPageSize());
		List<GtStudent> list = studentMapper.queryPage();
		PageInfo<GtStudent> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
}
