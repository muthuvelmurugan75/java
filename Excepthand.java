package com.muthuvel.www;

import java.util.Scanner;

public class Excepthand {

	private static final String Finally = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner obj=new Scanner (System.in);
		System.out.println("enter A value");
		int a=obj.nextInt();
		System.out.println("enter B value");
		int b=obj.nextInt();
		
		try{
			int d=a/b;
			System.out.println(d);
		}
		
		catch(ArithmeticException ec)    {
			System.out.println("please re enter ur number");
			
			
		}
				finally {
			System.out.println("final operation");
		}
	}

}
