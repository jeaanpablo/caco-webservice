package com.caco.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.ContactDAO;
import com.caco.facade.ContactFacade;
import com.caco.model.Contact;

@Transactional
@Service("contactFacade")
@Scope("prototype")
public class ContactFacadeImpl implements ContactFacade<Contact>{

	@Autowired
	ContactDAO contactDao;
	
	@Override
	public boolean insert(Contact contact) {
		
		Contact contact2 = contactDao.saveOrUpdate(contact);
		
		if (contact2 != null){
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
		
	}

	@Override
	public List<Contact> getAll() {
		
		return contactDao.findAll();
	}

	@Override
	public void update(Contact contact) {
		
		contactDao.saveOrUpdate(contact);
		
	}

	@Override
	public void delete(Contact contact) {
		
		contactDao.delete(contact);
		
	}

}
