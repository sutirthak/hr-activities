package com.qinvent.hr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qinvent.hr.models.Employee;
import com.qinvent.hr.repository.EmployeeRepo;
import com.qinvent.hr.service.EmployeeServ;

/**
 * This class is the implementation class for the Interface EmployeeServ
 */
@Service
public class EmployeeServIMPL implements EmployeeServ {
	@Autowired
	private EmployeeRepo empRepo;

	/**
	 * @param employee - Adds New Employee to the database
	 * @return emp - an object of Employee class
	 */
	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp = empRepo.save(employee);
		return emp;
	}

	/**
	 * Removes an Employee from database using id
	 * @param id
	 * @return String - an Operation Successful Message
	 */
	@Override
	public String removeEmployee(int id) {
		empRepo.deleteById(id);
		return "Employe Id: "+id+" Sucessfully Deleted";
	}

	/**
	 * This Method is used to Find a Particular Employee by id
	 * @param id
	 * @return emp or null
	 */
	@Override
	public Optional<Employee> findEmployee(int id) {
		Optional<Employee> emp = empRepo.findById(id);
		if(emp.isPresent())
			return emp;
		else
			return null;
	}

	/**
	 * This method is used to get the entire EmployeeList
	 * @return The EmployeeList
	 */
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = empRepo.findAll();
		return empList ;
	}

	/**
	 * This method is used to update the property of an employee
	 * @param id
	 * @return Message - Successful/Unsuccessful
	 */
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
