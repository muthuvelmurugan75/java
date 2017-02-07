package com.Murugan.www;

import java.util.Enumeration;
import java.util.Vector;

public class Vectordemo {
	
	public static void main(String[] args) {
		
		
	Vector v=new Vector();	
		
	v.add(123);
	v.add(12);
	v.add(13);
	v.add("muthuvel");
	

		Enumeration e=v.elements();
	v.addElement("murugan");
	
	e.nextElement();
	
	
	
	e.hasMoreElements();
	
	System.out.println(e);
	}

	
	
	
	
	
	
	
	
	
	

}
