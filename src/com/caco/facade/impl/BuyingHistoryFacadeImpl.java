package com.caco.facade.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.facade.BuyingHistoryFacade;
import com.caco.model.BuyingHistory;

@Transactional
@Service("buyingHistoryFacade")
@Scope("prototype")
public class BuyingHistoryFacadeImpl implements BuyingHistoryFacade<BuyingHistory>{

	@Override
	public boolean insert(BuyingHistory buyingHistory) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BuyingHistory> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BuyingHistory buyingHistory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(BuyingHistory buyingHistory) {
		// TODO Auto-generated method stub
		
	}

}
