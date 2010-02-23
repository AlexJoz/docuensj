package com.docuens.core;

/**
 * 
 * DNamedObject class, derived from DObject class, provide interfaces of name, description. <br>
 * name attribute could be used as a identifier for users/programmers.
 * 
 * @author Sangchual CHA
 *
 */
public class DNamedObject extends DObject {
	private String name = "" ; 
	private String description = "" ;
	
	public DNamedObject() {
		super() ;
	}
	
	public DNamedObject(long id) {
		super(id) ;
	}
	
	public DNamedObject(long id, String name) {
		super(id) ;
		setName(name) ;
	}
	
	public DNamedObject(long id, String name, String description) {
		super(id) ;
		setName(name) ;
		setDescription(description) ;
	}
	
	public DNamedObject(String name, String description) {
		super() ;
		setName(name) ;
		setDescription(description) ;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getName() {
		return name ;
	}
	
	public void setDescription(String description) {
		this.description = description ;
	}
	
	public String getDesription() {
		return description ;
	}
}
