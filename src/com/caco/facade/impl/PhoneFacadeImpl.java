package com.caco.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.PhonesDAO;
import com.caco.facade.PhoneFacade;
import com.caco.model.Phones;


@Transactional
@Service("phoneFacade")
@Scope("prototype")
public class PhoneFacadeImpl implements PhoneFacade<Phones>{
	
	@Autowired
	PhonesDAO phoneDAO;

	@Override
	public Phones insert(Phones phone) {
		Phones phones = phoneDAO.saveOrUpdate(phone);
		return phones;
	}

	@Override
	public List<Phones> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Phones phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Phones phone) {
		// TODO Auto-generated method stub
		
	}

}
