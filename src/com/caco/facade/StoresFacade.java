package com.caco.facade;

import java.util.List;

public interface StoresFacade<Stores> {
	
public boolean insert (Stores stores);
	
	public List<Stores> getAll();
	
	public void update( Stores stores);

	public void delete( Stores stores );

}
