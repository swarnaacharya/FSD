package com.mycompany.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mycompany.model.Customer;



public class CustomerMApper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setFirstName(rs.getString("FirstNAme"));
		customer.setLastName(rs.getString("LastName"));
		customer.setEmail(rs.getString("email"));
		return customer;
	}

	

}