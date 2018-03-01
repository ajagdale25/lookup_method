package com.cascade.type;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.hibernate.utility.HibernateUtility;

public class Test {

	public static void main(String[] args) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Laptop laptop1 = new Laptop(101, "HP1");
		Laptop laptop2 = new Laptop(102, "Apple1");
		Laptop laptop3 = new Laptop(103, "Dell1");
		List<Laptop> listOfLaptop= new ArrayList<Laptop>();
		listOfLaptop.add(laptop1);
		listOfLaptop.add(laptop2);
		listOfLaptop.add(laptop3);

		Student student= new Student(1, "Amol", listOfLaptop);
	
		System.out.println("Session Created");
		System.out.println("Student is Persist...");
		session.persist(student);
		System.out.println("laptop2 remove..");

		listOfLaptop.remove(laptop2);
		
		transaction.commit();
		session.close();
		System.out.println("Session Close");

	}
}
@Entity
class Student {
	@Id
	//@GeneratedValue(strategy=GenerationType.TABLE)
	private int sid;
	private String sname;
	@SuppressWarnings("deprecation")
	@OneToMany//({cascade=javax.persistence.CascadeType.REMOVE})
	//@Cascade({CascadeType.REMOVE, CascadeType.PERSIST})
	@Cascade({CascadeType.DELETE_ORPHAN, CascadeType.PERSIST})

	private List<Laptop> laptop;
	public Student(int sid, String sname,List<Laptop> laptop) {
		super();
		this.sid = sid;
		this.sname=sname;
		this.laptop = laptop;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	

}
@Entity
class Laptop
{	
	@Id
	private int lapId;
	public Laptop(int lapId, String lapName) {
		super();
		this.lapId = lapId;
		this.lapName = lapName;
	}
	private String lapName;
	@ManyToOne
	private Student student;
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	public String getLapName() {
		return lapName;
	}
	public void setLapName(String lapName) {
		this.lapName = lapName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}