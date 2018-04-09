package com.hibernate.caching;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.utility.Utility;


public class EmployeeTest2ndCache {

	public static void main(String[] args) throws Exception {
		Session session = null;
		try {
			Long deptId = 1L;
			session = Utility.getSessionFactory().openSession();
			Department department = session.get(Department.class, deptId);
			System.out.println("Department Name:" + department.getDeptName());
			List<Employee> employees = department.getEmployees();
			for (Employee employee : employees) {
				System.out.println("Employee Name : " + employee.getEmployeeName());
				System.out.println("Employee UserName : " + employee.getUsername());
				System.out.println("Employee Passsword : " + employee.getPassword());

				System.out.println("--------------------------------------------------------------");
			}
		} catch (Exception e) {
			throw e;
		} finally {
			if (session != null) {
				session.close();
			}
		}

		try {

			System.out.println("Get Department from Cache::::::::::::::");
			Long deptId = 1L;
			session = Utility.getSessionFactory().openSession();
			Department department = session.get(Department.class, deptId);
			System.out.println("Department Name:" + department.getDeptName());
			List<Employee> employees = department.getEmployees();
			for (Employee employee : employees) {
				System.out.println("Employee Name : " + employee.getEmployeeName());
				System.out.println("Employee UserName : " + employee.getUsername());
				System.out.println("Employee Passsword : " + employee.getPassword());

				System.out.println("--------------------------------------------------------------");
			}

		} catch (Exception e) {
			throw e;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
