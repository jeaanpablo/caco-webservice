package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.LoyalityCard;

@Transactional
public interface LoyalityDAO extends GenericDao<LoyalityCard>{
	
	public LoyalityCard listClientStores(Integer idClient);

}
