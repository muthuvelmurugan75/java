package com.roughwork.www;
import java.util.Scanner;

public class Addingonenumberbeforenumber {

	public static void main(String[] args) {
		int temp,sum,count=10;
Scanner obj=new Scanner(System.in);
System.out.println("enter first number");
	int a=obj.nextInt();
	System.out.println("enter second number");
	int b=obj.nextInt();
	System.out.println("enter how many types to be print a value");
	int d=obj.nextInt();
	for(int i=b;i<d;i++){
		sum=a+b;
		System.out.println(sum);
		a=b;
		b=sum;
		
	}
	}

}
