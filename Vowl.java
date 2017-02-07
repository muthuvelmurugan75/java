package com.Murugan.www;

import java.util.Scanner;

public class Vowl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("enter a name");
String str=in.nextLine();
int count=0;
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
			
			
			count++;
			System.out.println(ch);
		
			
		}
		
		
		
		
		
	}
	System.out.println("total words is   "+str.length());
		System.out.println("total vowels count is  "+count);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
