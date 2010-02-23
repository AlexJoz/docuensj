package com.docuens.graphics;

public class DBWBitmap extends DBitmap {
	protected byte[][] data ; 
	
	public DBWBitmap() {
		super() ;
	}
	
	public DBWBitmap(long id) {
		super(id) ;
	}
	
	public DBWBitmap(int width, int height) {
		super() ;
		allocate(width, height) ;
	}
	
	public DBWBitmap(long id, int width, int height) {
		super(id) ;
		allocate(width, height) ;
	}

	public void allocate(int width, int height) {
		property.set(width, height, 1) ;
		data = new byte[height][width] ;
	}
	
	public static void main(String[] args) {
		DBWBitmap bitmap = new DBWBitmap() ;
		bitmap.allocate(1800, 2400) ;
		bitmap.allocate(1800, 2400) ;
		bitmap.allocate(1800, 2400) ;
		bitmap.allocate(1800, 2400) ;
		bitmap.allocate(1800, 2400) ;
		bitmap.allocate(1800, 2400) ;
		bitmap.allocate(1800, 2400) ;
		bitmap.allocate(1800, 2400) ;
		bitmap.allocate(1800, 2400) ;
		bitmap.allocate(1800, 2400) ;
		bitmap.allocate(1800, 2400) ;
		
		
	}
}
