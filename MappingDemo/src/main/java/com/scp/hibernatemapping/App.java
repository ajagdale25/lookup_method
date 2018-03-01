package com.scp.hibernatemapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration= new Configuration();
    	configuration.configure();
    	SessionFactory sessionFactory= configuration.buildSessionFactory();
    	Session session= sessionFactory.getCurrentSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Laptop laptop= new Laptop();
    	laptop.setLapId(107);
    	laptop.setLapName("apple");
    	
    	Student student= new Student();
    	student.setStudId(3);
    	student.setStudName("Amol");
    	student.setStudMark(55);
    	student.getLaptop().add(laptop);
   
    	laptop.setStudent(student);
    	session.save(student);
    	session.save(laptop);
    	
    	session.getTransaction().commit();
    	session.close();
    	sessionFactory.close();
		
    	
    }
}
