package com.caco.facade;

import java.util.List;

public interface ContactFacade<Contact> {
	
public boolean insert (Contact contact);
	
	public List<Contact> getAll();
	
	public void update( Contact contact);

	public void delete( Contact contact );

}
