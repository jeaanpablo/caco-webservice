package com.caco.facade;

import java.util.List;

public interface AddressFacade<Address> {
	
public boolean insert (Address address);
	
	public List<Address> getAll();
	
	public void update( Address address);

	public void delete( Address address );

}
