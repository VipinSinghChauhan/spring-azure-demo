package com.chauhan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chauhan.interfaces.IEmployeeRepository;
import com.chauhan.models.Employee;

@Service
public class EmployeeService {

	@Autowired
	IEmployeeRepository repository;

	public Optional<Employee> getEmployee(int id) {
		return repository.findById(id);
	} 

	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public Optional<Employee> deleteEmployee(int id) {
		Optional<Employee> emp = repository.findById(id);
		repository.deleteById(id);
		return emp;
	}

	

}
