package com.muthuvel.www;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		int i,r = 0;

		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		int n=obj.nextInt();
		int m=n/2;
		for(i=2;i<=m;i++){		
		 
		}
		if(n%i==0){
			
			System.out.println("  not prime");
		}else{
			System.out.println("  prime");
		}

		
		
		
	}
}
