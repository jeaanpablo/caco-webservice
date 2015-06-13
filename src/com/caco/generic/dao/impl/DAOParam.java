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
package com.caco.generic.dao.impl;

import com.caco.generic.dao.GenericDao.MatchMode;
import com.caco.generic.dao.GenericDao.Orientation;

public class DAOParam {

	private Orientation orientation;
	private MatchMode matchMode;
	private Object value;
	private String name;

	public DAOParam() {
		super();
	}
	
	public DAOParam(String name, Object value) {
		this(name, value, null, null);
	}
	
	public DAOParam(String name, Object value, Orientation orientation) {
		this(name, value, orientation, null);
	}
	
	public DAOParam(String name, Object value, MatchMode matchMode) {
		this(name, value, null, matchMode);
	}
	
	public DAOParam(String name, Object value, Orientation orientation, MatchMode matchMode) {
		this();
		this.orientation = orientation;
		this.matchMode = matchMode;
		this.value = value;
		this.name = name;
	}

	public Orientation getOrientation() {
		return orientation;
	}
	
	public DAOParam setOrientation(Orientation orientation) {
		this.orientation = orientation;
		
		return this;
	}

	public MatchMode getMatchMode() {
		return matchMode;
	}

	public DAOParam setMatchMode(MatchMode matchMode) {
		this.matchMode = matchMode;
		
		return this;
	}

	public Object getValue() {
		return value;
	}

	public DAOParam setValue(Object value) {
		this.value = value;
		
		return this;
	}

	public String getName() {
		return name;
	}

	public DAOParam setName(String name) {
		this.name = name;
		
		return this;
	}
	
}
