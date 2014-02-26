package org.growthTech.controller;

import org.growthTech.dao.ParentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class UserParentController {
	@Autowired
	ParentDAO parentDAO;
	
	@RequestMapping("/parents")
	 public String showStudents(Model model) {
		 model.addAttribute("parents", parentDAO.findAllParents());
		 
		 return "parents";
		 
	 } 

}
