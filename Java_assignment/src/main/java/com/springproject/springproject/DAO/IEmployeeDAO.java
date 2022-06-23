package com.springproject.springproject.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.springproject.entity.Employee;

public interface IEmployeeDAO extends  JpaRepository<Employee, Integer>{
	}

