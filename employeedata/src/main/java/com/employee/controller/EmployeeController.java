package com.employee.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.pojo.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employeeDetails")
	public ArrayList<Employee> employeeDetails() {
		
		
		return employeeService.employeeDetails();
		
	}
	
	@GetMapping("/employeeById")
	public Employee employeeByID(@RequestParam int employeeId) {
		
		return employeeService.employeeByID(employeeId);
		
	}
     
	@GetMapping("/employeeByLocation")
	public ArrayList<Employee> employeeByLocation(@RequestParam String employeeLocation) {
		
		return employeeService.employeeByLocation(employeeLocation);
		
	}

}
