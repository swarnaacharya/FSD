package com.mycompany.hibernate_demo_map;

import static java.lang.System.in;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mycompany.hibernate_demo_map.factory.MyHibernatefactory;
import com.mycompany.hibernate_demo_map.onetoone_uni.Instructor;
import com.mycompany.hibernate_demo_map.onetoone_uni.InstructorDetail;






/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	try {
    		SessionFactory sessionFactory = MyHibernatefactory.getMySession();
    		Session session = null;
    		
    		
    		
    		session = sessionFactory.openSession();

    		InstructorDetail id = new InstructorDetail();
    		id.setHobby("Cricket");
    		id.setYoutubeChannel("www.youtube.com");
    		
    		Instructor i = new Instructor();    		
    		i.setFirstName("Sunny");
    		i.setLastName("Deol");
    		i.setEmail("sunny@i.com");
    		i.setInstructorDetail(id);
    		
    		
    		
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