package com.scp.hibernatefetching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
    	Scoopen scoopen1= new Scoopen();
    	Configuration configuration= new Configuration();
    	configuration.configure();
    	SessionFactory sessionFactory= configuration.buildSessionFactory();
    	Session session= sessionFactory.openSession();
    	Transaction transaction= session.beginTransaction();
    	//session.save(scoopen1);
    	scoopen1=session.get(Scoopen.class, 105);
    	transaction.commit();
    	session.close();
    	System.out.println(scoopen1);

    }
}
