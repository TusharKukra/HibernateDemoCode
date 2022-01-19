package com.tk.hibernate.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="student_table")
public class Student {
	
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	
	//@Column(name="student_name")
	//private String sname;
	
	// Also use StudentName Class
	@Column(name="student_name")
	private StudentName sname;
	
	public StudentName getSname() {
		return sname;
	}
	public void setSname(StudentName sname) {
		this.sname = sname;
	}

	@Column(name="student_class")
	//@Transient
	private String sclass;
	
	// Getters & Setters
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
//	public String getSname() {
//		return sname;
//	}
//	public void setSname(String sname) {
//		this.sname = sname;
//	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	
	// To string method: to fetch the value.
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sclass=" + sclass + "]";
	}
	
	
	
}
