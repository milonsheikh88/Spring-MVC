package springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.Models.User;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showContact() {
		return "contact";
	}
	
/*
	//2.Form handling with @RequestParam annotation
	@RequestMapping(path="/process", method=RequestMethod.POST)
	public String handalFrom(Model model,
			@RequestParam("email") String userEmail,
			@RequestParam("name") String userName,
			@RequestParam("pass") String userPass) {
		
		
		Users user=new Users();
		user.setEmail(userEmail);
		user.setName(userName);
		user.setPass(userPass);
		
				
//		model.addAttribute("email", userEmail);
//		model.addAttribute("name", userName);
//		model.addAttribute("pass", userPass);
		
		model.addAttribute("user", user);
		
		return "success";
	}
*/
	
	
	//3.Form handling with @ModelAttribute annotation
	@RequestMapping(path="/process", method=RequestMethod.POST)
	public String handalFrom(@ModelAttribute("u") User user, Model model) {	
		return "success";
	}
	
	@ModelAttribute
	public void commonDataFromModel(Model model) {
		model.addAttribute("Header", "Welcome to my first web apps");
	}
	
}
