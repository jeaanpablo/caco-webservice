package com.caco.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.caco.dao.ContactDAO;
import com.caco.generic.dao.impl.GenericDaoImpl;
import com.caco.model.Contact;

@Transactional
@Repository
@Scope("prototype")
public class ContactDaoImpl extends GenericDaoImpl<Contact> implements ContactDAO{

}
