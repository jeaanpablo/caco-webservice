package com.caco.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.BuyingHistoryDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.BuyingHistory;

@Transactional
@Repository
@Scope("prototype")
public class BuyingHistoryDaoImpl extends GenericDaoImpl<BuyingHistory> implements BuyingHistoryDAO {

	@Override
	public List <BuyingHistory> listBuyingHistory(Integer idClient) {
		String query = " SELECT " + 
				 "		bh " + 
				 " FROM " + 
				 "		BuyingHistory bh " +
				 " WHERE " + 
				 "		bh.client.idClient = :idClient ";
		
		Map<String, Object>parameters = new HashMap<>();
		parameters.put("idClient", idClient);
		
		List<BuyingHistory> BuyingHistory = findByNamedParams(query, parameters);
		
			
		return BuyingHistory; 
	}

	
}
