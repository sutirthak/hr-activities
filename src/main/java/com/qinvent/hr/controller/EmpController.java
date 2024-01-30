package com.qinvent.hr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/emp")
public class EmpController {
	@GetMapping("/home")
	public String EmpHomePage()
	{
		return "Welcome to Employee Data Management System";
	}
}


