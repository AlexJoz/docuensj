package com.docuens.graphics;

import com.docuens.core.*;

import java.lang.Math;

/**
 * 
 * DRect class, derived from DGraphicObject, provides interfaces for rectangle values.
 * 
 * @author Sangchual CHA
 *
 */
public class DRect extends DGraphicObject {
	private DPoint p1 = new DPoint() ;
	private DPoint p2 = new DPoint() ;
	
	public DRect() {
		super() ;
	}
	
	public DRect(DPoint p1, DPoint p2) {
		super() ;
		set(p1, p2) ;
	}
	
	public DRect(DRect rect) {
		super() ;
		set(rect) ;
	}

	public DRect(long id) {
		super(id) ;
	}
	
	public DRect(long id, DPoint p1, DPoint p2) {
		super(id) ;
		set(p1, p2) ;
	}
	
	public DRect(long id, DRect rect) {
		super(id) ;
		set(rect) ;
	}
	
	/**
	 * Make a clone of the rectangle.
	 * @param rect Source DRect class
	 */
	public void set(DRect rect) {
		set(rect.lt(), rect.lt()) ;
	}
	
	/**
	 * Set left/top and right/bottom value
	 * @param p1 left/top coordinate value
	 * @param p2 right/bottom coordinate value
	 */
	public void set(DPoint p1, DPoint p2) {
		set(p1.x(), p1.y(), p2.x(), p2.y()) ;
		//TODO Consider to call arrange() after setting coordinate values
	}
	
	/**
	 * Set left, top, right, bottom value
	 * @param left
	 * @param top
	 * @param right
	 * @param bottom
	 */
	public void set(int left, int top, int right, int bottom) {
		p1.set(left, top) ;
		p2.set(right, bottom) ;
		//TODO Consider to call arrange() after setting coordinate values
	}
	
	public DPoint lt() {
		return p1 ;
	}

	public DPoint lb() {
		DPoint p = new DPoint() ;
		p.set(p1.x(), p2.y()) ;
		return p ;
	}
	
	public DPoint rt() {
		DPoint p = new DPoint() ;
		p.set(p2.x(), p1.y()) ;
		return p ;
	}
	
	public DPoint rb() {
		return p2 ;
	}
	
	/**
	 * Sort coordinate values in order p1 to get left/top value and p2 to get right/bottom value.
	 */
	public void arrange() {
		int left = Math.min(p1.x(), p2.x()) ;
		int right = Math.max(p1.x(), p2.x()) ;
		int top = Math.min(p1.y(), p2.y()) ;
		int bottom = Math.max(p1.y(), p2.y()) ;
		
		set(left, top, right, bottom) ;
	}
	
	/**
	 * Determine whether rect places inside the rectangle.
	 * @param rect
	 * @return If rect places inside the rectangle, it returns true.
	 */
	public boolean isContains(DRect rect) {
		boolean isContains = false ;
		
		rect.arrange() ;
		arrange() ;
		
		if(isContains(rect.lt()) && isContains(rect.rb())) {
			isContains = true ;
		}
		return isContains ;
	}
	
	/**
	 * Determine whether p places inside the rectangle.
	 * @param p 
	 * @return If p places inside the rectangle, it returns true.
	 */
	public boolean isContains(DPoint p) {
		boolean isContains = false ;

		arrange() ; // Rearrange its position
		if(p.x() >= p1.x() && p.x() <= p2.x() && p.y() >= p1.y() && p.y() <= p2.y()) {
			isContains = true ;
		}
		return isContains ;
	}
	
	/**
	 * Determine whether rect is overlapped with the rectangle.
	 * @param rect 
	 * @return true - rect and DRect overlapped
	 */
	public boolean isOverlaped(DRect rect) {
		boolean isOverlaped = false ;

		if(isContains(lt()) || isContains(lb()) || isContains(rt()) || isContains(rb())) {
			isOverlaped = true ;
		}
		
		return isOverlaped ;
	}
}
