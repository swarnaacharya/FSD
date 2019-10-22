package com.mycompany.hibernate_demo_map.manytomany_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.mycompany.hibernate_demo_map.manytomany.model.Course;
import com.mycompany.hibernate_demo_map.manytomany.model.Instructor;
import com.mycompany.hibernate_demo_map.manytomany.model.InstructorDetail;
import com.mycompany.hibernate_demo_map.manytomany.model.Review;
import com.mycompany.hibernate_demo_map.manytomany.model.Student;

public class DeletePacmanCourseDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int courseId = 2;
			Course tempCourse = session.get(Course.class, courseId);

			System.out.println("Deleting course: " + tempCourse);

			session.delete(tempCourse);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			session.close();

			factory.close();
		}
	}

}