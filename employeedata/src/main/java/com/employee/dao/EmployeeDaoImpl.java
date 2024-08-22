package com.employee.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.employee.pojo.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	
	@Override
	
	public ArrayList<Employee> employeeDetails() {
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee e = new Employee();
		e.setEmployeeId(40015555);
		e.setEmployeeName("Rohini");
		e.setEmployeeDesgination("Manager");
		e.setEmployeeLocation("Mysore");
		
		Employee e1 = new Employee();
		e1.setEmployeeId(40015608);
		e1.setEmployeeName("Bhagi");
		e1.setEmployeeDesgination("ProjectManager");
		e1.setEmployeeLocation("Hyderabad");
		
		Employee e2 = new Employee();
		e2.setEmployeeId(4001444);
		e2.setEmployeeName("Zams");
		e2.setEmployeeDesgination("Ceo");
		e2.setEmployeeLocation("Mysore");
		
		al.add(e);
		al.add(e1);
		al.add(e2);
	
		
		//String data =e.getEmployeeId()+ " " +e.getEmployeeName()+ " "+e.getEmployeeDesgination()+" "+e.getEmployeeLocation();
		
		return al;
		
	}

	@Override
	public Employee employeeByID(int employeeId) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee e = new Employee();
		e.setEmployeeId(40015555);
		e.setEmployeeName("Rohini");
		e.setEmployeeDesgination("Manager");
		e.setEmployeeLocation("Mysore");
		
		Employee e1 = new Employee();
		e1.setEmployeeId(40015608);
		e1.setEmployeeName("Bhagi");
		e1.setEmployeeDesgination("ProjectManager");
		e1.setEmployeeLocation("Hyderabad");
		
		Employee e2 = new Employee();
		e2.setEmployeeId(4001444);
		e2.setEmployeeName("Zams");
		e2.setEmployeeDesgination("Ceo");
		e2.setEmployeeLocation("Mysore");
		
		al.add(e);
		al.add(e1);
		al.add(e2);
	
		for(Employee em : al) {
			if( em.getEmployeeId()== employeeId) {
				
				return em;
				
			}
			
		}
		return null;
	}
	
	@Override
	public ArrayList<Employee> getEmployeeByLocation(String employeeLocation) {
ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee e = new Employee();
		e.setEmployeeId(40015555);
		e.setEmployeeName("Rohini");
		e.setEmployeeDesgination("Manager");
		e.setEmployeeLocation("Mysore");
		
		Employee e1 = new Employee();
		e1.setEmployeeId(40015608);
		e1.setEmployeeName("Bhagi");
		e1.setEmployeeDesgination("ProjectManager");
		e1.setEmployeeLocation("Hyderabad");
		
		Employee e2 = new Employee();
		e2.setEmployeeId(4001444);
		e2.setEmployeeName("Zams");
		e2.setEmployeeDesgination("Ceo");
		e2.setEmployeeLocation("Mysore");
		
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		ArrayList<Employee> returnEmployeeList = new ArrayList<Employee>();
	
		for(Employee em : al) {
			
			if(em.getEmployeeLocation().equals(employeeLocation)) {
				
				returnEmployeeList.add(em);
			
			}
			
		}
		return returnEmployeeList;
		
		
	
	}
}
