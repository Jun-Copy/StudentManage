package com.san.stum.controller;

import com.san.stum.entity.GtTeacher;
import com.san.stum.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @RequestMapping("/show")
    public String show(ModelMap map){
        List<GtTeacher> list = teacherService.queryTeacher();
        map.put("list",list);
        return "Teacher/Teacher_list";
    }
}
