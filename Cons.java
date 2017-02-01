package com.muthuvel.www;

import java.util.Scanner;

public class Cons {

	public static void main(String[] args) {
		Cons in=new Cons();
		
	 int cnt=0;
	Scanner obj=new Scanner(System.in);
		
	 String str=obj.nextLine();
	int length=str.length();
	for(int i=0;i<str.length();i++){
		System.out.print(i);
		char ch=str.charAt(i);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			
			System.out.println("vowelsss");
		 
			cnt++;
			

		}
		System.out.println("vowel letters are"+cnt);
		
				
		
	}
	
	}
		
		
		
		
	}


