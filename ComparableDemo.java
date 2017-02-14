package com.payilagam.collection.comparable;

import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(12); 
		Employee e2 = new Employee(1); 
		Employee e3 = new Employee(2); 
		Employee e4 = new Employee(3); 
		TreeSet ts = new TreeSet(); 
		ts.add(e1); 
		ts.add(e2); 
		ts.add(e3); 
		ts.add(e4); 
		System.out.println(ts);
		
		TreeSet ts1 = new TreeSet(new MyComparator()); 

	}

}
