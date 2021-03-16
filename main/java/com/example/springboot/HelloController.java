package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {

	@RequestMapping("/login")
	public ModelAndView defaultHome() {
		return new ModelAndView("login");
	}
	@RequestMapping("/login")
	public String viewLoginPage()
	{
		return "login";
	}
	

	
}
