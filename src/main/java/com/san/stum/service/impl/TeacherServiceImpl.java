package com.san.stum.service.impl;

import com.san.stum.entity.GtTeacher;
import com.san.stum.mapper.GtTeacherMapper;
import com.san.stum.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private GtTeacherMapper gtTeacherMapper;

    @Override
    public int deleteByPrimaryKey(Integer teaId) {
        return gtTeacherMapper.deleteByPrimaryKey(teaId);
    }

    @Override
    public int insert(GtTeacher gtTeacher) {
        return gtTeacherMapper.insert(gtTeacher);
    }

    @Override
    public int insertSelective(GtTeacher gtTeacher) {
        return gtTeacherMapper.insertSelective(gtTeacher);
    }

    @Override
    public GtTeacher selectByPrimaryKey(Integer teaId) {
        return null;
    }


    @Override
    public int updateByPrimaryKeySelective(GtTeacher gtTeacher) {
        return gtTeacherMapper.updateByPrimaryKeySelective(gtTeacher);
    }

    @Override
    public int updateByPrimaryKey(GtTeacher gtTeacher) {
        return gtTeacherMapper.updateByPrimaryKey(gtTeacher);
    }

    @Override
    public List<GtTeacher> queryTeacher() {
        return gtTeacherMapper.queryTeacher();
    }

}
