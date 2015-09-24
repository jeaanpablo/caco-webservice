package com.caco.facade.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.facade.PointsParameterFacade;
import com.caco.model.PointsParameter;

@Transactional
@Service("permissionFacade")
@Scope("prototype")
public class PointsParameterFacadeImpl implements PointsParameterFacade<PointsParameter>{

	@Override
	public boolean insert(PointsParameter pointsParameter) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PointsParameter> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(PointsParameter pointsParameter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PointsParameter pointsParameter) {
		// TODO Auto-generated method stub
		
	}

}
