package springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home url");
		model.addAttribute("name", "Amaan Shaikh");
		return "index";

	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("About url");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Rafiya");
		modelAndView.setViewName("help");
		return modelAndView;

	}

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	


	@Transactional
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("userName") String userName,
			@RequestParam("password") String userPassword, Model model,@ModelAttribute User user) {

//		System.out.println(userEmail);
//		System.out.println(userName);
//		System.out.println(userPassword);
//
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
		
		System.out.println(user);
		
		model.addAttribute(user);
		

		this.userService.createUser(user);
		return "success";
	}

}
