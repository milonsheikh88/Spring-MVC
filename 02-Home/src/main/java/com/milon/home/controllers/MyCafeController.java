package com.milon.home.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	@RequestMapping("/cafe")
	public String showWelcomePage() {	
	 return "oreder-page";
	}
	
	@RequestMapping("/processOder")
	public String clickOrderNow(HttpServletRequest request,Model model) {
		
		//handle receive data from user
		String orderItem=request.getParameter("foodType");

		//Adding the user value to the model
		model.addAttribute("userInput", orderItem);
		
		//Set the user data with the model object and send it to view
		return "process-page";
	}

}
