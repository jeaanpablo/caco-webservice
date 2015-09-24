package com.caco.facade;

import java.util.List;

public interface EmployeeFacade<Employees> {
	
public boolean insert (Employees employee);
	
	public List<Employees> getAll();
	
	public void update( Employees employee);

	public void delete( Employees employee );

}
