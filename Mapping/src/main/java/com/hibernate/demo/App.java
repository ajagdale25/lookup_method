package com.hibernate.demo;

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
    	Student student= new Student(1, "Amol");
    	
    	Address address= new Address(1, "Mumbai", 123456);

    	Configuration configuration= new Configuration();
    	configuration.configure();
    	SessionFactory sessionFactory= configuration.buildSessionFactory();
    	Session session= sessionFactory.openSession();
    	session.beginTransaction();
    	
    	/*session.save(address);
    	student.setAd(address);
    	session.save(student);*/
    	session.save(address);
    	student.setAd(address);
    	address.setStudent(student);
    	session.save(student);
    	session.getTransaction().commit();
    	session.flush();
      	session.close();
    }
    
}
