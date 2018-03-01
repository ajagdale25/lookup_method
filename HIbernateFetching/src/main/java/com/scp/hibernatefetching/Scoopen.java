package com.scp.hibernatefetching;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scoopen_score_card")
public class Scoopen {
	@Id
	private int empId;
	private String fisrtName;
	private String lastName;
	private String seminarTopics;
	private String grade;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSeminarTopics() {
		return seminarTopics;
	}
	public void setSeminarTopics(String seminarTopics) {
		this.seminarTopics = seminarTopics;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Scoopen(int empId, String fisrtName, String lastName, String seminarTopics, String grade) {
		super();
		this.empId = empId;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.seminarTopics = seminarTopics;
		this.grade = grade;
	}
	public Scoopen() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Scoopen [empId=" + empId + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", seminarTopics="
				+ seminarTopics + ", grade=" + grade + "]";
	}
	
}
