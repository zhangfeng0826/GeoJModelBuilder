/**
 * Copyright (C) 2013 - 2016 Wuhan University
 * 
 * This program is free software; you can redistribute and/or modify it under 
 * the terms of the GNU General Public License version 2 as published by the 
 * Free Software Foundation.
 * 
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */
package com.geojmodelbuilder.core.data;

/**
 * @author Mingda Zhang
 *
 */
public interface IData{
	/**
	 * As for literal data, this returns basic data type, such as xs:double,xs:string
	 * As for complex data, this returns the mime type. 
	 */
	String getType();
	Object getValue();
	
	void setType(String type);
	void setValue(Object value);
}
