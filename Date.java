package com.Murugan.www;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {

	public static void main(String[] args) {

		Calendar in=Calendar.getInstance();
		System.out.println(		in.getTime());
		in.add(Calendar.DATE,-50);
		System.out.println(in.getTime());
GregorianCalendar obj=new GregorianCalendar();
	
	System.out.println(obj.before(2014));
		
		
	}

}
