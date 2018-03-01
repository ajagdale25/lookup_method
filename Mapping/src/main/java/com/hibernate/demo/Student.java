package com.hibernate.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stud_id")
	private int studId;
	@Column(name="stud_name")
	private String studName;
	/*@OneToOne
	@JoinColumn(name="local_address")
	private Address ad;*/
	
	@OneToOne(mappedBy="student", cascade = CascadeType.ALL)
    private Address ad;
	
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
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
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	
}
