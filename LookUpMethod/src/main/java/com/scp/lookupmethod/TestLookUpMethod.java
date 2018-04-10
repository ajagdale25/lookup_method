package com.scp.lookupmethod;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLookUpMethod {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Employee employee= (Employee) context.getBean("emp1");
		System.out.println("Before Modification.."+employee.getAddressData()+ ""+employee);
		employee.setName("xyz");
		//employee.getAddress().setCity("YYYY");
		employee.getAddressData().setCity("YYYY");
		
		Employee employee2= (Employee) context.getBean("emp1");
		System.out.println("Before Modification.."+employee2.getAddressData()+ ""+employee2);

	}

}
