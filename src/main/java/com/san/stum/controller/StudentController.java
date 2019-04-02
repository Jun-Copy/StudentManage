package com.san.stum.controller;

import com.github.pagehelper.PageInfo;
import com.san.stum.common.Page;
import com.san.stum.entity.GtStudent;
import com.san.stum.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@RequestMapping("/test")
	public String test(){
		return "test";
	}

	@RequestMapping("/page")
	public String page(Page page, ModelMap modelMap){
		PageInfo<GtStudent> pageInfo = studentService.queryPage(page);
		modelMap.put("pageInfo",pageInfo);
		modelMap.put("url","student/page?currentPage=");
		return "student/student_list";
	}
}
