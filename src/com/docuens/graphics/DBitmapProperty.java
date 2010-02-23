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
	private int xres, yres ;
	
	public static final double BYTE_SIZE = 8.0 ; 
	
	public DBitmapProperty() {
		super() ;
	}
	
	public DBitmapProperty(long id) {
		super(id) ;
	}
	
	public DBitmapProperty(int width, int height, int bpp, int xres, int yres) {
		super() ;
		set(width, height, bpp, xres, yres) ;
	}
	
	public DBitmapProperty(long id, int width, int height, int bpp, int xres, int yres) {
		super(id) ;
		set(width, height, bpp, xres, yres) ;
	}

	public void set(int width, int height, int bpp, int xres, int yres) {
		this.width = width ;
		this.height = height ;
		this.bpp = bpp ;
		this.bpl = getBPL(bpp) ;
		this.xres = xres ;
		this.yres = yres ;
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
	
	public void setXRes(int xres) {
		this.xres = xres ;
	}
	
	public int getXRes() {
		return this.xres ;
	}
	
	public void setYRes(int yres) {
		this.yres = yres ;
	}
	
	public int getYRes() {
		return this.yres ;
	}
}
