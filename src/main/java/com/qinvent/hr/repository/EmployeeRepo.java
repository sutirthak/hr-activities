package com.qinvent.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qinvent.hr.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
}
