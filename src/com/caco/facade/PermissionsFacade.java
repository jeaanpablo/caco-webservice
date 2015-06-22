package com.caco.facade;

import java.util.List;

public interface PermissionsFacade<Permissions> {
	
	public com.caco.model.Permissions insert (Permissions permission);
	
	public List<Permissions> getAll();
	
	public void update( Permissions permissions);

	public void delete( Permissions permission );
	
	public  com.caco.model.Permissions getByUser(Integer userId);

}
