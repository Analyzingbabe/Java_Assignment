package com.springproject.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.springproject.DAO.IEmployeeDAO;
import com.springproject.springproject.entity.Employee;
import com.springproject.springproject.service.IEmployeeService;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	IEmployeeService empService;
	
	@GetMapping("/view")   //endpoints
	public List<Employee> getEmployees(){
		return empService.findAll();
	}
	
	@GetMapping("/{empId}")   //endpoints
	public Employee getEmployeeById(@PathVariable(name="empId") int empId){
		return empService.findEmployeeById(empId);
	}
	@PostMapping("/add")   //endpoint
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}
		
	
	
}
