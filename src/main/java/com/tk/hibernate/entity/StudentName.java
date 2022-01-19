package com.tk.hibernate.entity;

import javax.persistence.Embeddable;

// Use embeddable to add this in the Entity

@Embeddable
public class StudentName {

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "StudentName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
