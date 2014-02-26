package org.growthTech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class UserManagementController {
	@RequestMapping("/users")
	 public String userManage(Model model) {
		 return "users";
	 } 
}
