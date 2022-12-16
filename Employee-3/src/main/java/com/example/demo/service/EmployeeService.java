package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;
	
	public String post(List<Employee> employee) {
		empRepo.saveAll(employee);
		return "Succesfully Posted";
	}

	public String update(Employee employee) {
		// TODO Auto-generated method stub
		empRepo.save(employee);
		return "Succsfully Updated";
	}
	
public Employee getCustomer(Integer id) {
		
		return empRepo.findById(id).orElseThrow(
				()-> new NoSuchElementException("No Employee present With Id")
				);
	}
	
}
