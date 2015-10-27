package com.caco.facade.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.facade.HistoryIndicationFacade;
import com.caco.model.HistoryIndication;

@Transactional
@Service("historyIndicationFacade")
@Scope("prototype")
public class HistoryIndicationFacadeImpl implements HistoryIndicationFacade<HistoryIndication>{

	@Override
	public boolean insert(HistoryIndication historyIndication) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HistoryIndication> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(HistoryIndication historyIndication) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(HistoryIndication historyIndication) {
		// TODO Auto-generated method stub
		
	}

}
