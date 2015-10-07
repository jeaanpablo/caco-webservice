package com.caco.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.facade.SalesFacade;
import com.caco.model.Sales;
import com.caco.model.Users;
import com.caco.dao.SalesDAO;
import com.caco.dao.UserDAO;

@Transactional
@Service("salesFacade")
@Scope("prototype")
public class SalesFacadeImpl implements SalesFacade<Sales>{

	@Autowired
	private SalesDAO salesDAO;
	
	@Override
	public Sales insert(Sales sale) {
Sales sales = salesDAO.saveOrUpdate(sale);
		
		return sale;
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
