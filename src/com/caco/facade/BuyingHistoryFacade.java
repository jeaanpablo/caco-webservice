package com.caco.facade;

import java.util.List;

public interface BuyingHistoryFacade<BuyingHistory> {
	
public boolean insert (BuyingHistory buyingHistory);
	
	public List<BuyingHistory> getAll();
	
	public void update( BuyingHistory buyingHistory);

	public void delete( BuyingHistory buyingHistory );

}
