package com.southwind.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.southwind.entity.Department;
import com.southwind.service.DepartmentService;

@Controller
public class DepartmentHandler {
	
	@Autowired
	private DepartmentService departmentService;
	
}
