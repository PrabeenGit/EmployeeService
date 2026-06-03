package com.employee.employeService.controller;



import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeService.entity.Employee;
import com.employee.employeService.repository.EmployeeReposiory;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

   
//	@Autowired
//	private EmployeeService empService;
	
	@Autowired
	private EmployeeReposiory empRepo;

   
	
	@GetMapping(value= "{empId}", produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Employee> getfindbyemplId(@PathVariable int empId){
		Optional<Employee> empDetails=empRepo.findById(empId);
		Employee emp=new Employee();
		
		BeanUtils.copyProperties(empDetails.get(), emp);
		
		return ResponseEntity.ok(emp);
	}

}
