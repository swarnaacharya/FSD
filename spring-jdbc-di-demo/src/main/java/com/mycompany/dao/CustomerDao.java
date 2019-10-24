package com.mycompany.dao;

import java.util.List;

import com.mycompany.model.Customer;

public interface CustomerDao {
	
	public void createCustomer(Customer customer);
	public List retrieveCustomer();

}