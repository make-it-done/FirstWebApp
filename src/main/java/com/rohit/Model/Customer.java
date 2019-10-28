package com.rohit.Model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Customer {

	@NotEmpty(message = "firstName should not be Empty")
	private String firstName;
	private String lastName;
	@Min(value = 0, message = "value should not be less than zero")
	@Max(value = 80, message = "age should not be greater than 80")
	@NotNull(message = "should not be null")
	private int age;
	@Email
	private String email;
	
	@CourseCode(value = {"roh","kum"} , message ="Please start with roh or kum")
	private String courseCode;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", courseCode=" + courseCode + "]";
	}
	
}
