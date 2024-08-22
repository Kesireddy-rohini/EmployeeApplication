package com.employee.service;

import java.util.ArrayList;

import com.employee.pojo.Employee;

public interface EmployeeService {
	
	public ArrayList<Employee> employeeDetails();
	
	public Employee employeeByID(int employeeId);
	
	public ArrayList<Employee> employeeByLocation(String employeeLocation);

}
