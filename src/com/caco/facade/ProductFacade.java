package com.caco.facade;

import java.util.List;

public interface ProductFacade<Products> {
	
public boolean insert (Products product);
	
	public List<Products> getAll();
	
	public void update( Products product);

	public void delete( Products product );

}
