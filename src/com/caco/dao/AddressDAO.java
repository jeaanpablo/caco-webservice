package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.Address;
import com.caco.model.ArchievedTransactions;

@Transactional
public interface AddressDAO extends GenericDao<Address>{

	
}
