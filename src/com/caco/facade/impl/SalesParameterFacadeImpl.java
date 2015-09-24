package com.caco.facade.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.facade.SalesParameterFacade;
import com.caco.model.SalesParameter;

@Transactional
@Service("permissionFacade")
@Scope("prototype")
public class SalesParameterFacadeImpl implements SalesParameterFacade<SalesParameter>{

	@Override
	public boolean insert(SalesParameter salesParameter) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<SalesParameter> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(SalesParameter salesParameter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(SalesParameter salesParameter) {
		// TODO Auto-generated method stub
		
	}

}
