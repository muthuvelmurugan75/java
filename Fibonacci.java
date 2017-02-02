package com.muthuvel.www;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,t;
		Scanner obj=new Scanner(System.in); 
		System.out.println("enter a value");
		 a=obj.nextInt();
		System.out.println("enter b value");
		b=obj.nextInt();
		
		
		for(int i=b;i<20;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			
			
			b=c;
			
			
			
			
			
			
		}
		
		
		
		
	}

}
