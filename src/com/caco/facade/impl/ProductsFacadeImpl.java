package com.caco.facade.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.facade.PointsParameterFacade;
import com.caco.facade.ProductFacade;
import com.caco.model.PointsParameter;
import com.caco.model.Products;

@Transactional
@Service("productsFacade")
@Scope("prototype")
public class ProductsFacadeImpl implements ProductFacade<Products>{

	@Override
	public boolean insert(Products product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Products product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Products product) {
		// TODO Auto-generated method stub
		
	}

}
