package org.growthTech.controller;

import org.growthTech.dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class UserStudentController {
	@Autowired
	StudentDAO studentDAO;
	
	@RequestMapping("/students")
	 public String showStudents(Model model) {
		 model.addAttribute("students", studentDAO.findAllStudents());
		 
		 return "students";
		 
	 } 
}
