package com.mycompany.hibernate_inheritence_demo;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)

public class EmployeeLocation extends Employee {
	private String location;
	private int salary;

	public EmployeeLocation() {
	}

	public EmployeeLocation(String ename, String email, String designation, String location, int salary) {
		super(ename, email, designation);
		this.location = location;
		this.salary = salary;
	}
}