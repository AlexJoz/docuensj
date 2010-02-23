package com.docuens.core;

/**
 * 
 * The base class of DocuensJ package. <br>
 * DObject class provide interface to identify each component.
 * 
 * @author Sangchual CHA
 *
 */
public class DObject {
	/**
	 * Identifier of class.
	 */
	private long id = 0 ; 
	
	/**
	 * DObject constructor
	 */
	public DObject() {
		
	}
	
	public DObject(long id) {
	  setId(id) ;
	}
	
	public void setId(long id) {
		this.id = id ;
	}
	
	public long getId() {
		return this.id ;
	}
}
