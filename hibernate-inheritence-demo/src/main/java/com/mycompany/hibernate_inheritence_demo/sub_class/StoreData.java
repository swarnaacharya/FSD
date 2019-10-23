package com.mycompany.hibernate_inheritence_demo.sub_class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StoreData {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Regular_Employee.class).addAnnotatedClass(Contract_Employee.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("John");
		Regular_Employee e2 = new Regular_Employee();
		e2.setName("Shane");
		e2.setSalary(50000);
		e2.setBonus(5);

		Contract_Employee e3 = new Contract_Employee();
		e3.setName("Sachin");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("15 hours");

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();
		session.close();
		System.out.println("success");
	}
}