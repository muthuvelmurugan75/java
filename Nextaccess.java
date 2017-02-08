package com.payilagam.www;

import java.util.HashSet;

public class Nextaccess {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("muthu");
		hs.add("place");
		hs.add("actor");
		hs.add("actor");
		System.out.println(hs);
		System.out.println(hs.size());
		
		HashSet h= new HashSet();
		h.add("place");
		h.addAll(hs);
		System.out.println(h);


	}


	
		
		
	}


