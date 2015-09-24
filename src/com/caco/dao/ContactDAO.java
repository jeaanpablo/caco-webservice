package com.caco.dao;

import org.springframework.transaction.annotation.Transactional;

import com.caco.generic.dao.GenericDao;
import com.caco.model.Contact;

@Transactional
public interface ContactDAO  extends GenericDao<Contact>{

}
