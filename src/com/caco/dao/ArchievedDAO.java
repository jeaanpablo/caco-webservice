package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.ArchievedTransactions;

@Transactional
public interface ArchievedDAO extends GenericDao<ArchievedTransactions>{
	
	public ArchievedTransactions listClientHistory(Integer idClient);

}
