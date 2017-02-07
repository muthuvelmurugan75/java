package com.Murugan.www;

import java.util.Scanner;

public class Vowls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("enter the name");
String str=in.nextLine();
for(int i=0;i<str.length();i++){
	
	char ch=str.charAt(i);
	if((ch=='a')||(ch=='e')||ch=='i'||(ch=='o')||(ch=='u')){
		
		System.out.println(ch);
	}
}
System.out.println(str.length());

		
		
		
		
		
		
	}

}
