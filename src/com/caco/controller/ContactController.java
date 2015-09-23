package com.caco.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.caco.facade.ContactFacade;
import com.caco.facade.TokenFacade;
import com.caco.model.Contact;
import com.caco.model.json.UserAppInserted;



@RestController
public class ContactController {
	
	@Autowired
	ContactFacade contactFacade;

	@RequestMapping(method = RequestMethod.POST, value = "/sendMessage")
	public @ResponseBody Boolean sendMessage(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "subject") String subject,
			@RequestParam(value = "message") String message)

	{		
		
		Contact contact = new Contact();
		contact.setNomeContact(name);
		contact.setEmail(email);
		contact.setSubject(subject);
		contact.setMessage(message);		
		
		Calendar calendar = Calendar.getInstance();
		contact.setDataContact(calendar);
		
		
		return contactFacade.insert(contact);

	}

}
