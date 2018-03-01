package com.hibernate.onetomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utility.HibernateUtility;


public class App {

	public static void main(String[] args) {
		Student student1= new Student("Amol","Jagdale", "Java");
		Student student2= new Student("Jagdish", "Khatre","Hibernate");
		Student student3= new Student("Swapnil", "Bhaviskar", ".Net");
		University university= new University("Pune","India");
		
		student1.setUniversity(university);
		student2.setUniversity(university);
		student3.setUniversity(university);
		
		Session session= HibernateUtility.getSessionFactory().openSession();
		Transaction transaction =session.beginTransaction();
		
		session.save(university);
		session.save(student1);
		session.save(student2);
		session.save(student3);
		
		List<Student> students=(List<Student>) session.createQuery("from Student").list();
		for (Student s : students) {
			System.out.println("Student Details : "+s);
			System.out.println("Student University Details: "+s.getUniversity());
		}
		transaction.commit();
		session.close();
		

	}

}
