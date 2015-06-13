package com.caco.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.ArchievedDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.LoyalityCard;
import com.caco.model.ArchievedTransactions;

@Transactional
@Repository
@Scope("prototype")
public class ArchievedDaoImpl extends GenericDaoImpl<ArchievedTransactions> implements ArchievedDAO {

	@Override
	public ArchievedTransactions listClientHistory(Integer idClient) {
		String query = " SELECT " + 
				 "		lc " + 
				 " FROM " + 
				 "		LoylityCard lc " +
				 " WHERE " + 
				 "		lc.client.idClient = :idClient ";
		
		Map<String, Object>parameters = new HashMap<>();
		parameters.put("idClient", idClient);
		
		List<ArchievedTransactions> ArchievedTransaction = findByNamedParams(query, parameters);
		
		ArchievedTransactions Archieved;
		
		if(ArchievedTransaction.size() == 1)
		{
			Archieved = ArchievedTransaction.get(0);
		}
		else
		{
			Archieved = null;
		}
		
		return Archieved; 
	}

	
}
