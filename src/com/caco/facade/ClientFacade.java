package com.caco.facade;

import java.util.List;

public interface ClientFacade<Clients> {

	public com.caco.model.Clients insert (Clients client);
	
	public List<Clients> getAll();
	
	public void update( Clients client);

	public void delete( Clients client );
	
	public Clients findAuthority( Integer id );
	
	
	
}
