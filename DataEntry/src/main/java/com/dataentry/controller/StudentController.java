package com.dataentry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dataentry.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping(value ="/showForm" , method = RequestMethod.GET)
	public String showForm(Model theModel) {
		theModel.addAttribute("student", new Student());
		return "RegistrationPage";
	}	
	@RequestMapping("/showDetails")
	public String showDetails(@ModelAttribute("student") Student student) {
		System.out.println("TheStudent : "+student.getFirstName());
		return "RegistrationDetail";
	}
		

}
