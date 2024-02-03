package com.qinvent.hr.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entity Class holding Employee Parameters, Data Types,Constructor and Getter-Setter functions.
 * id - Primary Key Auto-Generated for each Employee
 * name - Name of the Employee
 * age - Age of the Employee
 * type - Employee Type or Designation
 * salary - Employee Gross Salary
 * location - Employee Work Location
 */
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private String type;
	private float salary;
	private String location;

	/**
	 * Constructor for the class Employee
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter Function for id
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter Function for id
	 * @param id - Unique id of the employee
	 * @return void
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter Function for name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter Function for name
	 * @param name
     */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter Function for age
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Setter function for age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Getter function for Employee type
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter Funtion for type
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter function for salary
	 * @return salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * Setter function for salary
	 * @param salary
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * Getter function for location
	 * @return location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Setter function for location
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Employee class setting all the parameters to their default states
	 * @param id Primary Key Auto-Generated for each Employee
	 * @param name Name of the Employee
	 * @param age Age of the Employee
	 * @param type Employee Type or Designation
	 * @param salary Employee Gross Salary
	 * @param location Employee Work Location
	 */
	public Employee(int id, String name, int age, String type, float salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.type = type;
		this.salary = salary;
		this.location = location;
	}
}
