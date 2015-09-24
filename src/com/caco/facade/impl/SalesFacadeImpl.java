package com.caco.facade.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.facade.SalesFacade;
import com.caco.model.Sales;


@Transactional
@Service("permissionFacade")
@Scope("prototype")
public class SalesFacadeImpl implements SalesFacade<Sales>{

	@Override
	public boolean insert(Sales sale) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Sales> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Sales sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Sales sale) {
		// TODO Auto-generated method stub
		
	}

}
