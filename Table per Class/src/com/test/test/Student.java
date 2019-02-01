package com.test.test;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Student")  
public class Student extends Person{
		
	@Column(name="class_name")
	String class_name;
	
	public Student(int id, String class_name,String firstName, String lastName) {
		super( id, firstName,  lastName);
		
		this.class_name=class_name;
		
	}
	
	
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	
}
