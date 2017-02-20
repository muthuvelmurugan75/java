package com.Murugan.www;

import java.util.ArrayList;
import  java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
				
		ArrayList a=new ArrayList();
		
		
		a.add("jai");
		a.add("computer");
		a.add("pc");
		a.add("shift");
		a.add("shiftor");
		System.out.println(a);
		
		Iterator i=a.iterator();
		while(i.hasNext()){
			if(i.next().equals("computer")){
				System.out.println();
				i.remove();
			}
			//System.out.println(i.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
