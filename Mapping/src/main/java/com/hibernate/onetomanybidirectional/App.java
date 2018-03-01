package com.hibernate.onetomanybidirectional;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utility.HibernateUtility;

public class App {
	public static void main(String[] args) {
		Student student1= new Student("Amol","java");
		Student student2= new Student("Jagdish", ".Net");
		Student student3= new Student("Ashu", "c++");
		Address address= new Address("Pune",123456);
		List<Student> list=new ArrayList<Student>();
		student1.setAddress(address);
		student2.setAddress(address);
		student3.setAddress(address);
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		Session session= HibernateUtility.getSessionFactory().openSession();
		Transaction transaction =session.beginTransaction();
		//session.persist(address);
		@SuppressWarnings("unchecked")
		List<Student> students=session.createQuery("from Student").list();
		session.save(address);
		/*session.save(student1);
		session.save(student2);*/
		session.save(students);
		transaction.commit();
		session.close();

	}
}
