package com.muthuvel.www;

import java.util.Scanner;

public class Revstringusingnormalmethod {

	public static void main(String[] args) {
		int i=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a name");
		String str=obj.nextLine();
		for(i=str.length()-1;i>=0;i--){
			char ch=str.charAt(i);
System.out.print(ch);
		}
		
		
		
		
		
		
	}	
		
	}		