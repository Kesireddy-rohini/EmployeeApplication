package com.employee.employeedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.employee"})
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
