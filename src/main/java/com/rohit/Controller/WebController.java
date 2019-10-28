package com.rohit.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "fillForm";
	}

	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");

		System.out.println(firstName + " " + lastName);

		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);

		return "showFormData";

	}

	@RequestMapping("/processFormTwo")
	public String processForm(@RequestParam String firstName, @RequestParam String lastName, Model model) {

		System.out.println(firstName + " " + lastName);

		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName+"gupta");

		return "showFormData";

	}

}
