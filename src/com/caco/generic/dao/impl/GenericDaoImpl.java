///////////////////////////////////////////////////////////////////////////////
//                                                                           //
// Copyright Ericsson BSS Solution Design and Construction Team 2012         //
//                                                                           //
// The copyright to the computer program(s) herein is the property of        //
// Ericsson.                                                                 //
// The program(s) may be used and/or copied only with the written permission //
// of Ericsson or in accordance with the terms and conditions stipulated in  //
// the agreement/contract under which the program(s) have been supplied      //
//                                                                           //
///////////////////////////////////////////////////////////////////////////////
package com.caco.generic.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public abstract class GenericDaoImpl<MODEL extends com.caco.generic.model.GenericModel> implements com.caco.generic.dao.GenericDao<MODEL> {

	private EntityManager entityManager;
	private final Class<MODEL> oClass;// object class
	
	

	@Override
	public Class<MODEL> getObjectClass() {
		return this.oClass;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.entityManager = em;
	}

	protected EntityManager getEntityManager() {
		if (entityManager == null) {
			throw new IllegalStateException("Erro");
		}
		
		return entityManager;
	}

	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
		this.oClass = (Class<MODEL>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public MODEL saveOrUpdate(MODEL model) throws DataAccessException {
		MODEL modelMerge = getEntityManager().merge(model);
		
		return modelMerge;
	}

	@SuppressWarnings("unchecked")
	public List<MODEL> findAll() throws DataAccessException {
		String queryS = "SELECT obj FROM " + oClass.getSimpleName() + " obj";
		
		Query query = getEntityManager().createQuery(queryS);
		
		return query.getResultList();
	}

	public MODEL findById(Serializable id) throws DataAccessException {
		return (MODEL) getEntityManager().find(oClass, id);
	}

	public MODEL delete(MODEL model) throws DataAccessException {
		model = getEntityManager().merge(model);
		
		getEntityManager().remove(model);
		
		return model;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MODEL> findByNamedParams(String query, Map<String, Object> params) {
		Query q = getEntityManager().createQuery(query);
	
		for (String key : params.keySet()) {
			q.setParameter(key, params.get(key));
		}
		
		return q.getResultList();
	}

    @SuppressWarnings("unchecked")
    @Override
    public List<MODEL> listSearchParam(String query, Map<String, Object> params) {
        Query q = getEntityManager().createQuery(query);
      
        for (String key : params.keySet()) {
            q.setParameter(key, params.get(key));
        }
        
        return q.getResultList();
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<MODEL> listSearchParam(String query, Map<String, Object> params, int max, int current) {
		Query q = getEntityManager().createQuery(query).setMaxResults(max).setFirstResult(current);

		for (String key : params.keySet()) {
			q.setParameter(key, params.get(key));
		}
		
		return q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MODEL> listSearch(String query) {
		Query q = getEntityManager().createQuery(query);
		
		return q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public MODEL searchParam(String query, Map<String, Object> params) {
		Query q = getEntityManager().createQuery(query);
		
		for (String key : params.keySet()) {
			q.setParameter(key, params.get(key));
		}
		
		try {
			return (MODEL) q.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}
	
	
}
