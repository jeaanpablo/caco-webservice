package com.caco.facade.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.facade.StoresFacade;
import com.caco.model.Stores;

@Transactional
@Service("storesFacade")
@Scope("prototype")
public class StoresFacadeImpl implements StoresFacade<Stores>{

	@Override
	public boolean insert(Stores stores) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Stores> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Stores stores) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Stores stores) {
		// TODO Auto-generated method stub
		
	}

}
