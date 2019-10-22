

package com.mycompany.hibernate_demo_map.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_demo_map.onetoone_uni.Instructor;
import com.mycompany.hibernate_demo_map.onetoone_uni.InstructorDetail;




public class MyHibernatefactory {
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

