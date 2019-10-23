package com.mycompany.hibernate_inheritence_demo;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
					.addAnnotatedClass(EmployeeLocation.class)
					.addAnnotatedClass(EmployeeManager.class).buildSessionFactory();
			
			Session session = factory.openSession();
			Employee cd = new Employee("Swarna","swa2gmail.com","Developer");
			EmployeeLocation secd = new EmployeeLocation("Swarna","swa2gmail.com","Developer","Bangalore",30000);
			EmployeeManager icd = new EmployeeManager("Swarna","swa2gmail.com","Developer",150,"yadavi");
		session.getTransaction().begin();
			session.save(cd);
			session.save(secd);
			session.save(icd);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}