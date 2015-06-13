package com.caco.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.BuyingHistory;;

@Transactional
public interface BuyingHistoryDAO extends GenericDao<BuyingHistory>{
	
	public List<BuyingHistory> listBuyingHistory(Integer idClient);

}
