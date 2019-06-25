package com.southwind.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.southwind.repository.EmployeeRepository;
import com.southwind.entity.Employee;
import com.southwind.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> queryAll() {
		// TODO Auto-generated method stub
		return employeeRepository.queryAll();
	}
	
}
