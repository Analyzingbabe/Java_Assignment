package com.springproject.springproject.service;

import java.util.List;

import com.springproject.springproject.entity.Employee;

public interface IEmployeeService {
	List<Employee> findAll();
	Employee findEmployeeById(int id);
	
	Employee addEmployee(Employee emp);

}