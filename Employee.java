package com.payilagam.collection.comparable;

public class Employee implements Comparable{
	int eId;
	Employee(int eid)
	{
		this.eId = eid; 
	}
	public String toString(){
		return "Employee ID " +eId; 
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int eid1 = this.eId; 
		Employee e = (Employee)o; 
		int eid2 = e.eId; 
		if(eid1>eid2)
		return -1;
		else
			return 1; 
	}

}
