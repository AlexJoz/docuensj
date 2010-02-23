package com.docuens.graphics;

import com.docuens.core.* ;
import java.lang.Math; 

/**
 * 
 * DBitmapProperty class, derived from DNamedObject, provides interfaces for primitive attribute of the bitmap.
 * 
 * @author Sangchual CHA
 *
 */
public class DBitmapProperty extends DNamedObject {
	private int width ; 
	private int height ;
	private int bpp ;
	private int bpl ;
	
	public static final double BYTE_SIZE = 8.0 ; 
	
	public DBitmapProperty() {
		super() ;
	}
	
	public DBitmapProperty(long id) {
		super(id) ;
	}
	
	public DBitmapProperty(int width, int height, int bpp) {
		super() ;
		set(width, height, bpp) ;
	}
	
	public DBitmapProperty(long id, int width, int height, int bpp) {
		super(id) ;
		set(width, height, bpp) ;
	}

	public void set(int width, int height, int bpp) {
		this.width = width ;
		this.height = height ;
		this.bpp = bpp ;
		this.bpl = getBPL(bpp) ;
	}
	
	public void setWidth(int width) {
		this.width = width ;
	}
	
	public int getWidth() {
		return this.width ;
	}
	
	public void setHeight(int height) {
		this.height = height ;
	}
	
	public int getHeight() {
		return this.height ;
	}
	
	public void setBPP(int bpp) {
		this.bpp = bpp ;
	}
	
	public int getBPP() {
		return this.bpp ;
	}
	
	public int getBPL() {
		return this.bpl ;
	}
	
	public int getBPL(int bpp) {
		return (int) Math.ceil((double)bpp / BYTE_SIZE) ;
	}	
}
