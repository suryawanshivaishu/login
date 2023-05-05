package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.*;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		System.out.println("This is index page");
		model.addAttribute("name", "Rahul");
		model.addAttribute("id", 123);
		List<String> city=new ArrayList<String>();
		city.add("pune");
		city.add("nagpur");
		city.add("nashik");
		city.add("Mumbai");
		model.addAttribute("c", city);

		return "index";
	}
	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView m=new ModelAndView();
		m.addObject("name", "Rohit Joshi");
		m.addObject("rollnumber", 2);
		LocalDateTime now=LocalDateTime.now();
		m.addObject("time", now);
		m.setViewName("about");


		System.out.println("this is index page");
		return m;
		
	}

	@RequestMapping("/contact")
	public String contact() {
		System.out.println("this is index page");
		return "contact";
}
}
