package com.springproject.springproject.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springproject.springproject.DAO.IEmployeeDAO;
import com.springproject.springproject.entity.Employee;
@Component   //bean and will be auto detected by container
@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired   //injecting the dependancy between service class and DAO class
	IEmployeeDAO empDAO;

	@Override
	public List<Employee> findAll() {
		return empDAO.findAll();
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = empDAO.findById(id);
		Employee employee = optional.get();
		return employee;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empDAO.save(emp);
	}
}