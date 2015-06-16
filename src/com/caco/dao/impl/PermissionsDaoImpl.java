package com.caco.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.PermissionsDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Permissions;
import com.caco.model.Stores;


@Transactional
@Repository
@Scope("prototype")
public class PermissionsDaoImpl extends GenericDaoImpl<Permissions> implements PermissionsDAO{

	@Override
	public Permissions getByUser(Integer idUser) {
		// TODO Auto-generated method stub
		String query = " SELECT " + 
				 "		p " + 
				 " FROM " + 
				 "		Permissions p WHERE p.users.idUser = :idUser ";
		
		Map<String, Object>parameters = new HashMap<>();
		parameters.put("idUser", idUser);
		
		List<Permissions> permissions= findByNamedParams(query, parameters);
		
		Permissions permission;
		
		if(permissions.size() == 1)
		{
			permission = permissions.get(0);
		}
		else
		{
			permission = null;
		}
		
		return permission;
	}

}
