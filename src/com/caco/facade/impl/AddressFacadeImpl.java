package com.caco.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.AddressDAO;
import com.caco.facade.AddressFacade;
import com.caco.model.Address;


@Transactional
@Service("addressFacade")
@Scope("prototype")
public class AddressFacadeImpl implements AddressFacade<Address>{

	@Autowired
	AddressDAO addressDao;
	
	@Override
	public boolean insert(Address address) {
		
		Address address2 = addressDao.saveOrUpdate(address);
		
		if (address2 != null){
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
		
	}

	@Override
	public List<Address> getAll() {
		
		return addressDao.findAll();
	}

	@Override
	public void update(Address address) {
		
		addressDao.saveOrUpdate(address);
		
	}

	@Override
	public void delete(Address address) {
		
		addressDao.delete(address);
		
	}



}
