package com.contact.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.contact.dto.ContactDTO;
@Component
@Service
public interface ContactService {

	public boolean saveContact(ContactDTO contact);
	public boolean upadteContact(ContactDTO contact);
	public ContactDTO getContactById(Integer id);
	public List<ContactDTO> getAllContacts();
	public boolean deletContact(Integer id);

	
}
