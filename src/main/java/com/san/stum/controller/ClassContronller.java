package com.san.stum.controller;

import com.github.pagehelper.PageInfo;
import com.san.stum.common.Page;
import com.san.stum.entity.GtClass;
import com.san.stum.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/gtClass")
@Controller
public class ClassContronller {

    @Autowired
    private IClassService classService;

    @RequestMapping("/selectClass")
    public String selectClass(Page page, GtClass gtClass, ModelMap map){
        PageInfo<GtClass> pageInfo=classService.selectByCondition(page,gtClass);
        map.put("pageInfo",pageInfo);
        map.put("url","gtClass/selectClass");
        return  "Class/Class_list";
    }
}
