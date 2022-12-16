package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;

	public String post(List<Employee> e) {
		er.saveAll(e);
		return "SuccesFully Posted";
	}

}
