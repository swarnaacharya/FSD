

package com.mycompany.hibernate_map.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_map.event.Instructor;
import com.mycompany.hibernate_map.event.InstructorDetail;


public class MyHibernateFactory {
private static SessionFactory factory;
	
	public static SessionFactory getMySession()
	{
		factory=new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		return factory;
				
	}
}

