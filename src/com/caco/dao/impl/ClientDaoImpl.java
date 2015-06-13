package com.caco.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.ClientDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Clients;

@Transactional
@Repository
@Scope("prototype")
public class ClientDaoImpl extends GenericDaoImpl<Clients> implements ClientDAO{

}
