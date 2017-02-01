package com.muthuvel.www;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner obj=new Scanner (System.in);
		System.out.println("enter A value");
		int i=obj.nextInt();
		System.out.println("enter B value");
		int j=obj.nextInt();*/
		for(int i=0;i<=4;i++){
			
			for( int j=4;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("%");
		}
		System.out.println("&");

	}


}
