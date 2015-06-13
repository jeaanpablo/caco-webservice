package com.caco.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.PermissionsDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Permissions;


@Transactional
@Repository
@Scope("prototype")
public class PermissionsDaoImpl extends GenericDaoImpl<Permissions> implements PermissionsDAO{

}
