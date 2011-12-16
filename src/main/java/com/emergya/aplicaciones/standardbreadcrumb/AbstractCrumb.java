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
 * The abstract Crumb.
 */
public abstract class AbstractCrumb implements ICrumb{

	private String text;
	private String url;
	private ITrace parent;
	private Map<String, String> params;
	private Map<String, String> globalParams;
	
	/**
	 * {@inheritDoc}
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
	/**
	 * {@inheritDoc}
	 */
	public ITrace getParent() {
		return parent;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setParent(ITrace parent){
		this.parent = parent;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Map<String, String> getParams() {
		return params;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void addParam(String key, String value) {
		params.put(key, value);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String getParamValue(String key) {
		return params.get(key);
	}

	/**
	 * {@inheritDoc}
	 */
	public void addGlobalParam(String key, String value) {
		globalParams.put(key, value);		
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void removeGlobalParam(String key) {
		globalParams.remove(key);
	}

	/**
	 * {@inheritDoc}
	 */
	public Iterator<Map.Entry<String, String>> getGlobalParams() {
		Iterator<Map.Entry<String, String>> it = globalParams.entrySet().iterator();
		return it;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void setGlobalParams(Map<String, String> globalParams) {
		this.globalParams = globalParams;
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	public String getGETUrl() {
		String url = this.getUrl();
		
		Iterator<Map.Entry<String, String>> it_global = this.getGlobalParams();
		while (it_global.hasNext()) {
	        Map.Entry<String,String> pairs_glo = (Map.Entry<String,String>)it_global.next();
	        url += "&" + pairs_glo.getKey() + "=" + pairs_glo.getValue();
	    }
		
		Iterator<Map.Entry<String, String>> it_par = params.entrySet().iterator();
		while (it_par.hasNext()) {
	        Map.Entry<String, String> pairs_par = (Map.Entry<String, String>)it_par.next();
	        url += "&" + pairs_par.getKey() + "=" + pairs_par.getValue();
	    }
		
		return url;
	}


}
