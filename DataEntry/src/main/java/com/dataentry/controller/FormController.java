package com.dataentry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FormController {
	
	@RequestMapping("/")
	public String showPage() {
		return "HomePage";
	}

}
