package com.rohit.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rohit.Model.Student;

@Controller
@RequestMapping("/hello")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showStudentForm(Model model) {
		
		Student student = new Student();
		student.setFirstName("meena");
		student.setLastName("kumari");
		
		Map<String, String > countryList=new HashMap<String, String>();
		countryList.put("IN", "INDIA");
		countryList.put("RS", "Russia");
		countryList.put("BR", "Brazil");
		student.setCountryList(countryList);
		
		Map<String, String> courseList= new HashMap<String, String>();
		courseList.put("python", "Python");
		courseList.put("javascript", "Javascript");
		student.setCourseList(courseList);
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processStudentForm(@ModelAttribute("student") Student theStudent){
		
		System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName()+" "+theStudent.getCountry());
		return "student-confirmation";
	}
	@RequestMapping("/demoUrl")
	public String processDemoUrl()
	{
		return "demoUrl";
	}
	
	

}
