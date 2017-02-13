package com.Murugan.www;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter a name");
		String str=in.nextLine();
		
		for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
		
		switch(c){
		case 'a':
			System.out.println("a");
			break;
		case 'e':
			System.out.println("e");
			break;
		case 'i':
			System.out.println("i");
			break;
		case 'o':
			System.out.println("o");
			break;
		case 'u':
			System.out.println("u");
			break;
			
		}
					
		System.out.println(" vowel "+c);
			
		}
		

		
		
	}}


