package com.cg.ctrl;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "user")
public class UserController {
	
	@RequestMapping(value = "showLogin")
	public String prepareLogin(Model model) {
		System.out.println("In prepareLogin() method");
		model.addAttribute("login", new Login());
		return "login";	
	}
   
	@RequestMapping(value = "checkLogin")
	public String checkLogin() {
	
		return "loginSuccess";	
	}

	@RequestMapping(value = "showRegister")
	public String prepareRegister(Model model) {
		System.out.println("In prepareRegister() method");
		model.addAttribute("register", new User());
		return "register";	
	}
	@RequestMapping(value = "checkRegister")
	public String checkRegister(User user,Model model) {
	   model.addAttribute("user", user);
		return "registerSuccess";	
	}
}
