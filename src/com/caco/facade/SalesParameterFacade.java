package com.caco.facade;

import java.util.List;

public interface SalesParameterFacade<SalesParameter> {
	
public boolean insert (SalesParameter salesParameter);
	
	public List<SalesParameter> getAll();
	
	public void update( SalesParameter salesParameter);

	public void delete( SalesParameter salesParameter );

}
