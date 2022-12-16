package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.entity.Employee;
@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;

	public String post(List<Employee> e) {
		
		return ed.post(e);
	}

}
