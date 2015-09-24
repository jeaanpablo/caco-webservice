package com.caco.facade;

import java.util.List;

public interface LoyalityCardFacade<LoyalityCard> {
	
public boolean insert (LoyalityCard loyalityCard);
	
	public List<LoyalityCard> getAll();
	
	public void update( LoyalityCard loyalityCard);

	public void delete( LoyalityCard loyalityCard );

}

