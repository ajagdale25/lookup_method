package com.hibernate.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id")
	private int aId;
	@Column(name="city")
	private String city;
	@Column(name="pin")
	private int pin;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Student student;
	public Address(int aId, String city, int pin) {
		super();
		this.aId = aId;
		this.city = city;
		this.pin = pin;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
