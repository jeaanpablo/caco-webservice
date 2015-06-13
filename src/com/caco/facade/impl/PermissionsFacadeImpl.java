package com.caco.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.ClientDAO;
import com.caco.dao.PermissionsDAO;
import com.caco.facade.PermissionsFacade;
import com.caco.model.Permissions;

@Transactional
@Service("permissionFacade")
@Scope("prototype")
public class PermissionsFacadeImpl implements PermissionsFacade<Permissions>{
	
	@Autowired
	PermissionsDAO permissionDao;

	@Override
	public Permissions insert(Permissions permission) {
		Permissions permissions = permissionDao.saveOrUpdate(permission);
		
		return permissions;
	}

	@Override
	public List<Permissions> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Permissions permissions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Permissions permission) {
		// TODO Auto-generated method stub
		
	}

}
