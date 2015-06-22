package com.caco.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.ClientDAO;
import com.caco.facade.ClientFacade;
import com.caco.model.Clients;


@Transactional
@Service("clientFacade")
@Scope("prototype")
public class ClientFacadeImpl implements ClientFacade<Clients>{
	
	@Autowired
	ClientDAO clientDao;

	@Override
	public Clients insert(Clients client) {
		
		Clients clients = clientDao.saveOrUpdate(client);
		
		return clients;
	}

	@Override
	public List<Clients> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Clients client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Clients client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Clients findAuthority(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
