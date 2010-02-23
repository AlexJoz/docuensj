package com.docuens.graphics;

import com.docuens.core.*;

public class DBitmap extends DGraphicObject {
	protected boolean allocated = false ;
	protected DBitmapProperty property ; 
	
	public DBitmap() {
		super() ;
		property = new DBitmapProperty() ;
	}
	
	public DBitmap(long id) {
		super(id) ;
		property = new DBitmapProperty() ;
	}
}
