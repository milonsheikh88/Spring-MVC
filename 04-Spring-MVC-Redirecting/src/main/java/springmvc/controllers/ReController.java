package springmvc.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

//	//Redirect prefix
//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("This is one handeller Redirect prefix");
//		return "redirect:/two";
//	}
	
	//RedirectView
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is one handeller RedirectView");
		
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("This is two handeller");

		return "two";
	}

}
