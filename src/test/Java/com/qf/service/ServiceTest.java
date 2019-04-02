package com.qf.service;

import com.san.stum.entity.GtTeacher;
import com.san.stum.mapper.GtTeacherMapper;
import com.san.stum.service.ITeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class ServiceTest {

    @Autowired
    private ITeacherService teacherService;

    @Test
    public void query(){
        GtTeacher gtTeacher = teacherService.selectByPrimaryKey(1);
        System.out.println(gtTeacher.getTeaName());

    }

    @Test
    public void query1(){
        List<GtTeacher> list = teacherService.queryTeacher();
        System.out.println(list);
    }
}
