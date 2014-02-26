package org.growthTech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes
public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHome(Model model){		 
		 return "home";
	}
}
