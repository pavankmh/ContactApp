package com.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.contact.dto.ContactDTO;
import com.contact.service.ContactService;

@Controller
public class ViewContactsController {

	@Autowired
	private ContactService contactService;

	public String handleAddCtctHyperLink(Model model) {
		return null;
	}

	@GetMapping("/editContact")
	public String editContact(@RequestParam("cid") Integer cid, Model model) {

	
		ContactDTO contactDTO = contactService.getContactById(cid);
		model.addAttribute("contactDTO", contactDTO);
		return "index";
	}

	@GetMapping("/deleteContact")
	public String deleteContact(@RequestParam("cid") Integer cid, Model model,RedirectAttributes attributes) {
			contactService.deletContact(cid);
			attributes.addFlashAttribute("deleteSucMsg", "Record deleted succesfully");
		return "redirect:/viewAllContacts";

	}
}
