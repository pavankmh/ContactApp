package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.contact.dto.ContactDTO;
import com.contact.service.ContactService;

@Controller
public class ContactInfoController {

	@Autowired
	private ContactDTO contactDTO;
	@Autowired
	private ContactService contactService;

	// to display form
	@GetMapping(value = "/")
	public String loadContactForm(Model model) {

	
		contactDTO = new ContactDTO();
		model.addAttribute("contactDTO", contactDTO);

		return "index";
	}

	// form submission
	@PostMapping("/saveContact")
	public String saveContact(@ModelAttribute("contactDTO") ContactDTO c, RedirectAttributes attributes) {

		boolean isSaved = contactService.saveContact(c);

		if (isSaved) {
			if (c.getCid() != null) {
				attributes.addFlashAttribute("updateMsg", "Contact updated succesfully ");
			} else {
				attributes.addFlashAttribute("succMsg", "Contact Saved");
			}
		} else {
			attributes.addFlashAttribute("errMsg", "Failed To Save Contact");
		}

		return "redirect:/contactSavedStatus";
	}

	@GetMapping(value = "/contactSavedStatus")
	public String contactSavedStatus(Model model) {

		model.addAttribute("contactDTO", new ContactDTO());

		return "index";
	}

	@GetMapping("/viewAllContacts")
	public String handleViewCtctsHyperlink(Model model) {
		List<ContactDTO> allContacts = contactService.getAllContacts();

		model.addAttribute("contacts", allContacts);

		return "ViewContacts";
	}
}
