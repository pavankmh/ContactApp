package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.dto.ContactDTO;
import com.contact.persistance.ContactDetailsEntity;
import com.contact.persistance.ContactDetailsRespository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDetailsRespository contactDetailsRespository;

	@Override
	public boolean saveContact(ContactDTO contact) {

		ContactDetailsEntity entity = new ContactDetailsEntity();
		BeanUtils.copyProperties(contact, entity);

		ContactDetailsEntity savedEntity = contactDetailsRespository.save(entity);

		return (savedEntity.getCid() != null);
	}

	@Override
	public boolean upadteContact(ContactDTO contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ContactDTO getContactById(Integer id) {

		Optional<ContactDetailsEntity> retrivedEntity = contactDetailsRespository.findById(id);

		if (retrivedEntity.isPresent()) {
			ContactDetailsEntity contactDetailsEntity=retrivedEntity.get();
			ContactDTO contactDTO = new ContactDTO();
			BeanUtils.copyProperties(contactDetailsEntity, contactDTO);
			return contactDTO;
		}

		return null;
	}

	@Override
	public List<ContactDTO> getAllContacts() {

		List<ContactDTO> conList = new ArrayList<>();
		List<ContactDetailsEntity> allContacts = contactDetailsRespository.findAll();
		allContacts.forEach(entity -> {

			ContactDTO c = new ContactDTO();
			BeanUtils.copyProperties(entity, c);

			conList.add(c);

		});

		return conList;
	}

	@Override
	public boolean deletContact(Integer id) {
	
		contactDetailsRespository.deleteById(id);
		
		return true;
	}

}
