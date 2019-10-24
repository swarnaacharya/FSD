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




public class CustomerDaoImpl implements CustomerDao {

	private DataSource dataSource=null;
	
	
	@Override
 public void createCustomer(Customer customer) {
		Connection connection=null;
		 Statement statement=null;
		 PreparedStatement pStatement=null;
		
		try {
			connection=dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(dataSource.toString());
		try {
			pStatement=connection.prepareStatement("insert into customer(FirstName,LastName,Email) values(?,?,?)");
			pStatement.setString(1, customer.getFirstName());
			pStatement.setString(2, customer.getLastName());
			pStatement.setString(3, customer.getEmail());
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public CustomerDaoImpl(DataSource dataSource) {
		
		this.dataSource = dataSource;
	}

	public List<Customer> retrieveCustomer()
	{
		List<Customer> list =new ArrayList<Customer>();
		Connection connection=null;
		Statement statement=null;
		PreparedStatement preparedStatement =null;
		
		
		
		try{
			
				connection=dataSource.getConnection();	
		}
		catch(SQLException e)
		{
		   e.printStackTrace();	
		}
		System.out.print(dataSource.toString());
		
		try {
				statement =connection.createStatement();
				ResultSet rs =statement.executeQuery("select * from customer");
			while(rs.next());
			{
				list.add(new Customer(rs.getString(1),rs.getString(2),rs.getString(3)));
			}
		}
		
			catch(Exception e)
			{
				e.printStackTrace();
			}
	return list;
			
	
		
	}
	
	
	
	
	
}
