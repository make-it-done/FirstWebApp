package com.rohit.Model;
import java.util.Map;

import javax.validation.constraints.NotNull;

public class Student {

	@NotNull(message ="firstName should not be null")
	private String firstName;
	private String lastName;
	private String country;	
	private Map<String, String > countryList;
	private String course;
	private Map<String, String> courseList;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Map<String, String> getCountryList() {
		return countryList;
	}
	public void setCountryList(Map<String, String> countryList) {
		this.countryList = countryList;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Map<String, String> getCourseList() {
		return courseList;
	}
	public void setCourseList(Map<String, String> courseList) {
		this.courseList = courseList;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + ", countryList="
				+ countryList + ", course=" + course + ", courseList=" + courseList + "]";
	}
	
	
	
	
}
