package com.chauhan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chauhan.models.Employee;
import com.chauhan.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public String message() {
		return "Welcome to the Application!!!";
	}

	@GetMapping("/employee/{empId}")
	public Optional<Employee> getEmployee(@PathVariable("empId") int id) {
		return employeeService.getEmployee(id);
	}

	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@DeleteMapping("/employee/{id}")
	public Optional<Employee> deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
	}
}
