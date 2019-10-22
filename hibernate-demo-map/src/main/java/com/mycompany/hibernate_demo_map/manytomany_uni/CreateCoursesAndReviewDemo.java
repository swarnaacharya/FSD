package com.mycompany.hibernate_demo_map.manytomany_uni;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.mycompany.hibernate_demo_map.manytomany.model.Course;
import com.mycompany.hibernate_demo_map.manytomany.model.Instructor;
import com.mycompany.hibernate_demo_map.manytomany.model.InstructorDetail;
import com.mycompany.hibernate_demo_map.manytomany.model.Review;
import com.mycompany.hibernate_demo_map.manytomany.model.Student;

public class CreateCoursesAndReviewDemo {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {			
			
		
			session.beginTransaction();
			
			
		
			Course tempCourse = new Course("Pacman - How To Score One Million Points");
			
			
			tempCourse.addReview(new Review("Great course ... loved it!"));
			tempCourse.addReview(new Review("Cool course, job well done"));
			tempCourse.addReview(new Review("What a dumb course, you are an idiot!"));
						
			// save the course ... and leverage the cascade all :-)
			System.out.println("Saving the course");
			System.out.println(tempCourse);
			System.out.println(tempCourse.getReviews());
			
			session.save(tempCourse);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
		
			session.close();
			
			factory.close();
		}
	}

}

