///////////////////////////////////////////////////////////////////////////////
//                                                                           //
// Copyright Ericsson BSS Solution Design and Construction Team 2010         //
//                                                                           //
// The copyright to the computer program(s) herein is the property of        //
// Ericsson.                                                                 //
// The program(s) may be used and/or copied only with the written permission //
// of Ericsson or in accordance with the terms and conditions stipulated in  //
// the agreement/contract under which the program(s) have been supplied      //
//                                                                           //
///////////////////////////////////////////////////////////////////////////////
package com.caco.generic.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.caco.generic.model.GenericModel;

public interface GenericDao<MODEL extends GenericModel> {
	
	public enum Orientation {
		ASC,
		DESC
	}

	public enum MatchMode {
		EXACT,
		END,
		ANYWHERE,
		START
	}

	Class<MODEL> getObjectClass();
	
    MODEL saveOrUpdate(MODEL model) throws DataAccessException;

    MODEL findById(Serializable id) throws DataAccessException;
    
    List<MODEL> findAll() throws DataAccessException;
    
    MODEL delete(MODEL model) throws DataAccessException;

	List<MODEL> findByNamedParams(String query, Map<String, Object> params);

	List<MODEL> listSearchParam(String query, Map<String, Object> params, int max, int current);

	List<MODEL> listSearch(String query);

	MODEL searchParam(String query, Map<String, Object> params);

	List<MODEL> listSearchParam(String query, Map<String, Object> params);
	
}
