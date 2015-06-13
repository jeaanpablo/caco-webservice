package com.caco.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.LoyalityDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.LoyalityCard;
import com.caco.model.Users;

@Transactional
@Repository
@Scope("prototype")
public class LoyalityDaoImpl extends GenericDaoImpl<LoyalityCard> implements LoyalityDAO {

	@Override
	public LoyalityCard listClientStores(Integer idClient) {
		String query = " SELECT " + 
				 "		lc " + 
				 " FROM " + 
				 "		LoylityCard lc " +
				 " WHERE " + 
				 "		lc.client.idClient = :idClient ";
		
		Map<String, Object>parameters = new HashMap<>();
		parameters.put("idClient", idClient);
		
		List<LoyalityCard> loyalityCard = findByNamedParams(query, parameters);
		
		LoyalityCard loyality;
		
		if(loyalityCard.size() == 1)
		{
			loyality = loyalityCard.get(0);
		}
		else
		{
			loyality = null;
		}
		
		return loyality; 
	}

	
}
