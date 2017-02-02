package com.muthuvel.www;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your  value");
		int a=obj.nextInt();

		if(a%2==0){
			System.out.println("even");
						
		}
		else 
			System.out.println("odd");

		
	}

}
