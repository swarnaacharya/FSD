package com.mycompany.dao;

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

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}