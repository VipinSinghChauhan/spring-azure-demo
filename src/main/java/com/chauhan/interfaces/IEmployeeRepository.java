package com.chauhan.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chauhan.models.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
