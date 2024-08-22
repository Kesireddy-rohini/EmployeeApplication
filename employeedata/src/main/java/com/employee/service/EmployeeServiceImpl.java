package com.employee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.pojo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	EmployeeDao employeeDao;
	public ArrayList<Employee> employeeDetails() {
		
		
		return employeeDao.employeeDetails()  ;
	}
	@Override
	public Employee employeeByID(int employeeId) {
		
		return employeeDao.employeeByID(employeeId);
	}
	@Override
	public ArrayList<Employee> employeeByLocation(String employeeLocation) {
		
		return employeeDao.getEmployeeByLocation(employeeLocation);
	}

}
