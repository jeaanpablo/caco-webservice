package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.Stores;

@Transactional
public interface StoresDAO extends GenericDao<Stores>{
	
	public Stores listStores();

}
