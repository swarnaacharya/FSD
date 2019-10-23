package com.mycompany.hibernate_inheritence_demo;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)

public class EmployeeManager extends Employee {
	private int  mid;
	private String mname;

	public EmployeeManager() {
		super();
	}

	public EmployeeManager(String ename, String email, String designation,int mid,  String mname) {
		super(ename, email, designation);
		this.mid=mid;
		this.mname = mname;
	}
}