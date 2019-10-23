package com.mycompany.hibernate_map;

import static java.lang.System.in;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mycompany.hibernate_map.event.Instructor;
import com.mycompany.hibernate_map.event.InstructorDetail;
import com.mycompany.hibernate_map.factory.MyHibernateFactory;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	try {
    		SessionFactory sessionFactory = MyHibernateFactory.getMySession();
    		Session session = null;
    		
    		
    		
    		session = sessionFactory.openSession();

    		InstructorDetail id = new InstructorDetail();
    		id.setHobby("Cricket");
    		id.setYoutube_channels("www.youtube.com");
    		
    		Instructor i = new Instructor();    		
    		i.setFirst_name("Sunny");
    		i.setLast_name("Deol");
    		i.setEmail("sunny@i.com");
    		i.setInstructorDetailId(id);
    		
    		
    		
    		session.getTransaction().begin();
    		session.persist(id);
    		session.persist(i);
  			session.getTransaction().commit();	
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
		   
    }
}