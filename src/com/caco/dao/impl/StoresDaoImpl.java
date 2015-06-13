package com.caco.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.StoresDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Stores;

@Transactional
@Repository
@Scope("prototype")
public class StoresDaoImpl extends GenericDaoImpl<Stores> implements StoresDAO {

	@Override
	public Stores listStores() {
		String query = " SELECT " + 
				 "		s " + 
				 " FROM " + 
				 "		Stores s ";
		
		Map<String, Object>parameters = new HashMap<>();
		//parameters.put("idClient", idClient);
		
		List<Stores> Stores = findByNamedParams(query, parameters);
		
		Stores Store;
		
		if(Stores.size() == 1)
		{
			Store = Stores.get(0);
		}
		else
		{
			Store = null;
		}
		
		return Store; 
	}

	
}
