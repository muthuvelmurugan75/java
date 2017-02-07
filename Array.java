package com.Murugan.www;

import java.io.EOFException;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Array {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		ArrayList a=new ArrayList(al);
		//System.out.println("size"+al.size());
		//System.out.println("hashcode"+al.hashCode());
//		System.out.println("empty"+al.isEmpty());
		al.add("muthuvel");
		al.add("uma");
		al.add("jos");
	//	Collections.sort(al);
		System.out.println(al);
		al.add("jos");
		
		al.set(2," mani");
		al.set(1, "jai");
		Iterator i=al.iterator();
		
		i.hasNext();
		System.out.println(i.hasNext());
		
		
System.out.println(al.get(2));
		
		System.out.println(al.get(1));
		System.out.println(al.remove("muthuvel"));
		System.out.println(al);
		
		
		
		
	}
	
		
		
		
	

}

