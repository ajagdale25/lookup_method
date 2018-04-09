package com.hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.utility.Utility;

public class EmployeeTest {

	public static void main(String[] args) {
		
			SessionFactory sessionFactory= Utility.getSessionFactory();
			Session session= sessionFactory.openSession();
			session.beginTransaction();
			Employee employee1 = new Employee();
			employee1.setEmployeeName("Amol");
			employee1.setUsername("ajagdale25");
			employee1.setPassword("2802");
			
			Employee employee2 = new Employee();
			employee2.setEmployeeName("Amruta");
			employee2.setUsername("amadey");
			employee2.setPassword("goa");
			
			Department department1 = new Department();
			department1.setDeptName("java");
			department1.getEmployees().add(employee1);
			department1.getEmployees().add(employee2);
			
			employee1.setDepartment(department1);
			employee2.setDepartment(department1);
			
			session.persist(department1);
			session.getTransaction().commit();
			session.close();
			sessionFactory.close();
		
	}
}