package com.southwind.repository;

import java.util.List;

import com.southwind.entity.Employee;

public interface EmployeeRepository {
	public List<Employee> queryAll();
}
