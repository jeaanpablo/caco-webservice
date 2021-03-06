package com.caco.facade;

import java.util.List;

public interface SalesFacade<Sales> {
	
public Sales insert (Sales sale);
	
	public List<Sales> getAll();
	
	public void update( Sales sale);

	public void delete( Sales sale );

}
