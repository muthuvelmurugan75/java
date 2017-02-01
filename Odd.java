package com.muthuvel.www;

import java.util.Scanner;

public class Odd {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int a=obj.nextInt();
		
		Odd in=new Odd();
		in.oddeven(a);

	}

	private void oddeven(int a) {
		// TODO Auto-generated method stub
		if(a%2==0){
			System.out.println("even");
		}else{
				System.out.println("odd");
			
			}
		
		
	}

}
