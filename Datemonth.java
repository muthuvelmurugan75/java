package com.payilagam.www;

import java.util.Scanner;

public class Datemonth{

	public static void main(String[] args) {
int count=0;
		int b=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the month");
		int month=obj.nextInt();
		System.out.println("enter the day");
		int day=obj.nextInt();
int []arrayofmonth={31,28,31,30,31,30,31,31,30,31,30,31};
	for(int i=0;i<month-1;i++){
		count=count+arrayofmonth[i];
		 b=count+day;
	}
	System.out.println(b);

		
		
	}

}
