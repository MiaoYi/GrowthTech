package org.growthTech.controller;

import org.growthTech.dao.CardDAO;
import org.growthTech.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class CardController {
	@Autowired
	CardDAO cardDAO;
	
	@RequestMapping(value = "/card", method = RequestMethod.GET)
	public String getCard(@ModelAttribute("card")
	Card card, BindingResult result){
		 
		 return "card";
	}
	
	 @RequestMapping(value = "/card", method = RequestMethod.POST)
	    public String addContact(@ModelAttribute("card")
	                            Card card, BindingResult result) {
	         
	        if(card.getCover() == null) {
	        	System.out.println("cover is null");
	        }

	        cardDAO.insert(card);
	         
	        return "redirect:cards";
	    }
	
	 @RequestMapping("/cards")
	 public String showCards(Model model) {
		 model.addAttribute("cards", cardDAO.findAllCards());
		 
		 return "cards";
		 
	 } 

}
