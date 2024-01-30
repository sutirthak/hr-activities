package com.qinvent.hr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qinvent.hr.models.Employee;
import com.qinvent.hr.repository.EmployeeRepo;
import com.qinvent.hr.service.EmployeeServ;

@Service
public class EmployeeServIMPL implements EmployeeServ {
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp = empRepo.save(employee);
		return emp;
	}
	@Override
	public String removeEmployee(int id) {
		empRepo.deleteById(id);
		return "Employe Id: "+id+" Sucessfully Deleted";
	}

	@Override
	public Optional<Employee> findEmployee(int id) {
		Optional<Employee> emp = empRepo.findById(id);
		if(emp.isPresent())
			return emp;
		else
			return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = empRepo.findAll();
		return empList ;
	}

	@Override
	public String updateEmployee(int id) {
		Optional<Employee> emp = empRepo.findById(id);
		if(emp.isPresent())
		{
			Employee emps = new Employee();
			empRepo.save(emps);
			return "Employee Updated Sucessfully...";
			
		}
		else {
			return "Employee Not Found !!";
			
		}
	}
}
