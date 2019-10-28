package com.rohit.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rohit.Model.Customer;

@Controller
@RequestMapping("/showCustomer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showCustomer(Model model)
	{
		Customer customer = new Customer();
		customer.setFirstName("rohit");
		customer.setLastName("Kumar");
		customer.setAge(-1);
		customer.setEmail("rohit@gmail.com");
		model.addAttribute("customer",customer);
		return "show-customer";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult)
	{
		System.out.println(bindingResult.getAllErrors());
		if(bindingResult.hasErrors())
			return "show-customer";
		else
		return "customer-confirmation";
	}
}
