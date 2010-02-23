package com.docuens.graphics;

import com.docuens.core.*;

/**
 * 
 * DPoint class, derived from DGraphicObject, provides interfaces for coordinate value of x-axis and y-axis.
 * 
 * @author Sangchual CHA
 *
 */
public class DPoint extends DGraphicObject {
	private int x, y  ;
	
	public DPoint() {
		super() ;
	}
	
	public DPoint(long id) {
		super(id) ;
	}

	public DPoint(int x, int y) {
		super() ;
		
		setX(x) ;
		setY(y) ;
	}
	
	public DPoint(long id, int x, int y) {
		super(id) ;
		
		setX(x) ;
		setY(y) ;
	}

	public DPoint(DPoint p) {
		super() ;
		set(p) ;
	}
	
	public DPoint(long id, DPoint p) {
		super(id) ;
		set(p) ;
	}

	public void setX(int x) {
		this.x = x ;
	}
	
	public int getX() {
		return x() ;
	}
	
	public int x() {
		return x ;
	}

	public void setY(int y) {
		this.y = y ;
	}
	
	public int getY() {
		return y() ;
	}
	
	public int y() {
		return y ;
	}
	
	public void set(int x, int y) {
		this.x = x ;
		this.y = y ;
	}
	
	public void set(DPoint p) {
		this.x = p.x() ;
		this.y = p.y() ;
	}
}
