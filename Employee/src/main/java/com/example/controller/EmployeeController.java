package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value="/post")
	public String post(@RequestBody List<Employee> e) {
		return es.post(e);
	}

}
