package com.employee.eurekaserver.endpoints;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.eurekaserver.entity.Employee;

@RestController
@RequestMapping("/address")
public class AddressService {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value= "{empId}", produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Employee> getfindbyemplId(@PathVariable int empId){
		return restTemplate.getForEntity("http://employee-service/employee/"+empId, Employee.class);
	}
}
