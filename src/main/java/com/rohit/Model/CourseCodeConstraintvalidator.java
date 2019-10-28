package com.rohit.Model;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintvalidator implements ConstraintValidator<CourseCode, String> {

	private List<String> coursePrefix;
	
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub
		coursePrefix=Arrays.asList( constraintAnnotation.value());
		System.out.println(coursePrefix);
		
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		for(String str: coursePrefix)
		{
			if(value.startsWith(str))
				return true;
		}
		return false;
	}

	

}
