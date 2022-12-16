package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping(value = "/postemployee")
	public String PostEmpList(@RequestBody List<Employee> employee) {
		return employeeService.post(employee);
	}
	@PutMapping(value = "/updateemployeelist")
	public String updateEmpList(@RequestBody Employee employee) {
		return employeeService.update(employee);
	}
	@GetMapping("/getEmployee/{id}")
	public Employee getCustomer(@PathVariable int id) {
		return employeeService.getCustomer(id);
		
	}
	
}
