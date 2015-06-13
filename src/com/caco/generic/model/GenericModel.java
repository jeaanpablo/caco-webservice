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
package com.caco.generic.model;

import java.io.Serializable;

public interface GenericModel {
	
	Serializable getId();
	void setId(Serializable id);
}
