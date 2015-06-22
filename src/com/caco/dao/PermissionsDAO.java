package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.Permissions;

@Transactional
public interface PermissionsDAO extends GenericDao<Permissions>{
	
	public Permissions getByUser (Integer idUser);

}
