package springmvc.controllers;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedCaseInsensitiveMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("----home------");
		return "home";
	}
	
	//1.Send data by Model object
	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("----about------");
		
		int id=101;
		String name="Milon Sheikh";

		List<String> friends=new ArrayList<String>();
		friends.add("Amir");
		friends.add("Alamin");
		friends.add("Kamal");
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		model.addAttribute("fr",friends);
		
		return "about";
	}	

	//2.Send data by ModelAndView object
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("----help------");
		
		int id=101;
		String name="Milon Sheikh";

		List<String> friends=new ArrayList<String>();
		friends.add("Amir");
		friends.add("Alamin");
		friends.add("Kamal");
		
		LocalDateTime now= LocalDateTime.now();
		
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.setViewName("help");
		
		modelAndView.addObject("time", now);
		modelAndView.addObject("id", id);
		modelAndView.addObject("name", name);
		modelAndView.addObject("fr",friends);
		
		return modelAndView;
	}
}
