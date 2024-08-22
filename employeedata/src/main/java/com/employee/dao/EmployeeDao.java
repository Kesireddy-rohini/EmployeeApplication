package com.employee.dao;

import java.util.ArrayList;

import com.employee.pojo.Employee;

public interface EmployeeDao {
	public ArrayList<Employee> employeeDetails();
	
	public Employee employeeByID(int employeeId);
	
	public ArrayList<Employee> getEmployeeByLocation(String employeeLocation);

}
