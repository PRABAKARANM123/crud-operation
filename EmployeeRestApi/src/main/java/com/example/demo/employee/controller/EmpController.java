package com.example.demo.employee.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.employee.repository.EmpRepo;
import com.example.demo.employee.repository.Employee;

@RestController
public class EmpController {
	@Autowired
	EmpRepo empRepo;
	@GetMapping("/employee-list")
	public List<Employee> employeeList(){
		return empRepo.findAll();	
	}
	
	
	
	@PostMapping("/post-employee")
	public Employee post(@RequestBody Employee employee) {
		return empRepo.saveAndFlush(employee);
	}
	@DeleteMapping("/delete-employee/{id}")
	public String deleteById(@PathVariable int id) {
		empRepo.deleteById(id);
		return "Succesfully Deleted";
		
	}

}
