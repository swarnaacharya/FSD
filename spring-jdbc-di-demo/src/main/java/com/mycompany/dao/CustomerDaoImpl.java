package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.xml.Jdbc4SqlXmlHandler;

import com.mycompany.model.Customer;
import com.mysql.cj.protocol.Resultset;
import com.sun.corba.se.spi.orbutil.fsm.State;
import com.sun.crypto.provider.RSACipher;
import com.sun.org.apache.xml.internal.dtm.ref.CustomStringPool;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CustomerDaoImpl implements CustomerDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public void createCustomer(Customer customer) {
		jdbcTemplate.update("insert into customers(FirstName,Lastname,email) values (?,?,?)",
				customer.getFirstName(),customer.getLastName(),customer.getEmail());
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select first_name,last_name,email from customers", new CustomerMApper());
	}

	public void deleteCustomer()
	{
		jdbcTemplate.update("delete from Customers where id=?",19);
	}
	
	public void updateCustomer(Customer cust)
	{
		jdbcTemplate.update("update from Customers where id=4 set  email=? ",cust.getFirstName(),
		cust.getLastName(),cust.getEmail());
	}
}
