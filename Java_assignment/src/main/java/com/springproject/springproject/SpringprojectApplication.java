package com.springproject.springproject;

import java.util.List;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springproject.springproject.entity.Employee;
import com.springproject.springproject.service.EmployeeService;
import com.springproject.springproject.service.IEmployeeService;

@SpringBootApplication
public class SpringprojectApplication {

	public static void main(String[] args) {
		

		ConfigurableApplicationContext container=SpringApplication.run(SpringprojectApplication.class, args);
		System.out.println("hello welcome to servelet");
		//IEmployeeService employeeService=new EmployeeService(); //this not a spring
				//employeeService.findAll();
				
				IEmployeeService empService = (EmployeeService) container.getBean(EmployeeService.class); //giving the bean class to the container and getting the object
				List<Employee> list = empService.findAll();
				list.forEach((employee)->System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId()+"\t"+employee.getPassword()));
			
				}
		
	}


