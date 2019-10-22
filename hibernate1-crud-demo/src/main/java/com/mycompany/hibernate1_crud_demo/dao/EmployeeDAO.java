package com.mycompany.hibernate1_crud_demo.dao;

import java.util.List;

import com.mycompany.hibernate1_crud_demo.shared.SharedEmployee;

public interface EmployeeDAO {

	public void createEmployee(SharedEmployee sEmployee);

	public List<SharedEmployee> getAllEmployee();

	public SharedEmployee findById(int id);
	
	public void findByCustomId(String customId);
	
	public void deleteEmployee(int id);

	void updateEmployee(int id);
	

}