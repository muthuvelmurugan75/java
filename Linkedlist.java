package com.Murugan;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

		LinkedList ll=new LinkedList();
		ll.add( "muthuvel");
		ll.add( "jos");
		ll.add( "vel");
		ll.add( "master");
		ll.add( "palviyabari");
		System.out.println(ll);
		ll.remove(4);

		System.out.println(ll);
		System.out.println("after");
		System.out.println(ll.get(4));
	}

}
