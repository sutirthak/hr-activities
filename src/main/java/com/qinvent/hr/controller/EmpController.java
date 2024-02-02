package com.qinvent.hr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the Controller class responsible for Handling Server Level Requests
 * @EmpController - The Landing Page for the System
 */
@RestController
@RequestMapping("/emp")
public class EmpController {
	@GetMapping("/home")
	public String EmpHomePage()
	{
		return "Welcome to Employee Data Management System";
	}
}


