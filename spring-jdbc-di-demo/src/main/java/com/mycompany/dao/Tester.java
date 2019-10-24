package com.mycompany.dao;


import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.dao.CustomerDao;
import com.mycompany.dao.CustomerDaoImpl;
import com.mycompany.model.Customer;

public class Tester {

	public static void main(String[] args) {

		try {

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDao customerDAO = context.getBean("customerDao", CustomerDaoImpl.class);

			customerDAO.createCustomer(new Customer("Sourav", "Ganguly", "sourav@luv2code.com"));
			System.out.println("ok!");
			
			customerDAO.updateCustomer(new Customer("shefali", "bs", "shif@gmail.com"));
			System.out.println("updated");
			
			customerDAO.deleteCustomer();
			
			
			  List<Customer> list=customerDAO.getAllCustomer(); Iterator<Customer>
			  i=list.iterator(); while(i.hasNext()) { Customer c=i.next();
			  System.out.println(c.getFirstName()+" , "+c.getLastName()+" , "+c.getEmail())
			  ; }

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}