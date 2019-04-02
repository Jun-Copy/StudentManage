package com.san.stum.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.san.stum.common.Page;
import com.san.stum.entity.GtClass;
import com.san.stum.mapper.GtClassMapper;
import com.san.stum.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements IClassService {

    @Autowired
    private GtClassMapper gtClassMapper;

    @Override
    public PageInfo<GtClass> selectByCondition(Page page, GtClass gtClass) {
        PageHelper.startPage(page.getCurrentPage(),page.getPageSize());
        List<GtClass> gtClassList=gtClassMapper.selectByCondition(gtClass);
        PageInfo<GtClass> pageInfo=new PageInfo<GtClass>(gtClassList);
        return pageInfo;
    }
}
