package com.hibernate.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="University")
public class University {
	@Id
	@GeneratedValue
	@Column(name="university_id")
	private long universityId;
	@Column(name="university_name")
	private String universityName;
	@Column(name="country")
	private String Country;
	public long getUniversityId() {
		return universityId;
	}
	
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(String universityName, String country) {
		super();
		this.universityName = universityName;
		Country = country;
	}

	public void setUniversityId(long universityId) {
		this.universityId = universityId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "University [universityId=" + universityId + ", universityName=" + universityName + ", Country="
				+ Country + "]";
	}
	
	
	
}
