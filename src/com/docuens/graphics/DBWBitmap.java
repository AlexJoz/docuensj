package com.docuens.graphics;


/**
 * 
 * DBWBitmap class, derived from DBitmap class.
 * 
 * @author chasc
 *
 */
public class DBWBitmap extends DBitmap {
	protected byte[][] data ; 
	
	public DBWBitmap() {
		super() ;
	}
	
	public DBWBitmap(long id) {
		super(id) ;
	}
	
	public DBWBitmap(int width, int height, int xres, int yres) {
		super() ;
		set(width, height, 1, xres, yres) ;
		allocate(width, height) ;
	}
	
	public DBWBitmap(long id, int width, int height, int xres, int yres) {
		super(id) ;
		property.set(width, height, 1, xres, yres) ;
		allocate(width, height) ;
	}

	public void allocate(int width, int height) {
		data = new byte[height][width] ;
	}
}
