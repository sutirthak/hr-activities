package com.qinvent.hr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qinvent.hr.models.Employee;
import com.qinvent.hr.service.EmployeeServIMPL;
@RestController
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmployeeServIMPL employeeservice;

	@GetMapping("/home")
	public String EmpHomePage()
	{
		return "Welcome to Employee Data Management System";
	}

	@RequestMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeservice.getAllEmployee();
	}

	@RequestMapping(method = RequestMethod.GET, value="/employees/{id}")
	public  Optional<Employee> findEmployeeById(@PathVariable int id) {
        return employeeservice.findEmployee(id);
    }

	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeservice.addEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/employees/{id}")
	public String updateEmployee(@PathVariable int id)
	{
		return employeeservice.updateEmployee(id);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/employees/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		return employeeservice.removeEmployee(id);
	}
}


