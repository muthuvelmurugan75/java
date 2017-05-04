package com.practiceprograms.www;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
System.out.println("enter the value of a");
int a=obj.nextInt();
System.out.println("enter the value of b");
int b=obj.nextInt();
for(int i=b;i<10;i++){
	int c=a+b;
	System.out.println(c);
	a=b;
	b=c;
			
}

	}

}
