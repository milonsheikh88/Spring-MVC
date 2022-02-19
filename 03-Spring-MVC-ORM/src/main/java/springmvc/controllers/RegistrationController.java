package springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.Models.User;
import springmvc.service.UserService;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserService userService;

	//Form handling with @ModelAttribute annotation
	@RequestMapping(path="/process", method=RequestMethod.POST)
	public String handalFrom(@ModelAttribute("u") User user, Model model) {	
		int createdUserId = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id "+createdUserId);
		return "success";
	}
	
	@ModelAttribute
	public void commonDataFromModel(Model model) {
		model.addAttribute("Header", "Welcome to my first web apps");
	}
	
}
