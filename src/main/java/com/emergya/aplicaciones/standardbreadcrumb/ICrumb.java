package com.emergya.aplicaciones.standardbreadcrumb;

import java.util.Iterator;
import java.util.Map;

/**
 * Copyright (C) 2011, Emergya (http://www.emergya.es)
 *
 * @author <a href="mailto:eserrano@emergya.com">Eduardo Serrano Luque</a>
 * @author <a href="mailto:jsoler@emergya.com">Jaime Soler</a>
 * @author <a href="mailto:jariera@emergya.com">José Alfonso Riera</a>
 * @author <a href="mailto:frodriguez@emergya.com">Francisco Rodríguez Mudarra</a>
 *
 * This file is Component BreadCrumb
 *
 * This software is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301  USA
 *
 * As a special exception, if you link this library with other files to
 * produce an executable, this library does not by itself cause the
 * resulting executable to be covered by the GNU General Public License.
 * This exception does not however invalidate any other reasons why the
 * executable file might be covered by the GNU General Public License.
 */



/**
 * The Interface ICrumb.
 */
public interface ICrumb {

	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText();
	
	/**
	 * Sets the text.
	 *
	 * @param text the new text
	 */
	public void setText(String text);
	
	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	public String getUrl();
	
	/**
	 * Sets the url.
	 *
	 * @param url the new url
	 */
	public void setUrl(String url);
	
	
	/**
	 * Gets the parent.
	 *
	 * @return the parent
	 */
	public ITrace getParent();
	
	/**
	 * Sets the parent.
	 *
	 * @param parent the new parent
	 */
	public void setParent(ITrace parent);
	
	/**
	 * Gets the params.
	 *
	 * @return the params
	 */
	public Map<String, String> getParams();
	
	/**
	 * Adds the param.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public void addParam(String key, String value);
	
	/**
	 * Gets the param value.
	 *
	 * @param key the key
	 * @return the param value
	 */
	public String getParamValue(String key);
	
	/**
	 * Adds the global param.
	 *
	 * @param key the key
	 */
	public void addGlobalParam(String key, String value);
	
	
	/**
	 * Removes the global param.
	 *
	 * @param key the key
	 */
	public void removeGlobalParam(String key);
	
	
	/**
	 * Gets the global params.
	 *
	 * @return the global params
	 */
	public Iterator<Map.Entry<String, String>> getGlobalParams();
	
}
