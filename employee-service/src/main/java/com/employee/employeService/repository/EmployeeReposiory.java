package com.employee.employeService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.employeService.entity.Employee;

@Repository
public interface EmployeeReposiory extends JpaRepository<Employee, Integer>{
	
	
}

