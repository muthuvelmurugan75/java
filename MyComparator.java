package com.payilagam.collection.comparable;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2; 
		return e1.compareTo(e2); 
		//return 0;
	}

}
