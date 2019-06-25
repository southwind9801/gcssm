package com.southwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.southwind.entity.Department;
import com.southwind.entity.Employee;
import com.southwind.service.EmployeeService;

@Controller
public class EmployeeHandler {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value="/findAll")
	public ModelAndView test(){
		List<Employee> list = employeeService.queryAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("list", list);
		return modelAndView;
	}
	
}
