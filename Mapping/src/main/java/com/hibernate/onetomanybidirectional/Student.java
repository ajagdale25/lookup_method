package com.hibernate.onetomanybidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@Column(name="student_id")
	private int studId;
	@Column(name="student_name")
	private String studName;
	@Column(name="student_Department")
	private String studDept;
	@ManyToOne
	@JoinColumn(name="Adr")
	private Address address;
	public Student(String studName, String studDept) {
		super();
		this.studName = studName;
		this.studDept = studDept;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudDept() {
		return studDept;
	}
	public void setStudDept(String studDept) {
		this.studDept = studDept;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
