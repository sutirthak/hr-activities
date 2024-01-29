package com.qinvent.hr.service;

import java.util.List;
import java.util.Optional;

import com.qinvent.hr.models.Employee;

public interface EmployeeServ {
	
	
	public Employee addEmployee(Employee employee);
	
	public String removeEmployee(int id);
	
	public Optional<Employee> findEmployee(int id);
	
	public List<Employee> getAllEmployee();
	
	
	public String updateEmployee(int id);

	
	
	

}
