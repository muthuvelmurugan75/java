package com.tricky.www;

import java.util.Scanner;

public class StringContainsDigitsOrNot {
	public static   void main(String args[]) { 
		
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a name");
		String str=obj.nextLine();
		
		for(int i=0;i<str.length();i++)
	{
			
			char ch=str.charAt(i);
			if((ch=='0')||(ch=='1')||
					
					(ch=='2')|| (ch=='3')|| (ch=='4')|| (ch=='5')||(ch=='6')|| (ch=='7')|| (ch=='8')|| (ch=='9')){
				
				System.out.println("present");
			}
			else{
				System.out.println("not");
			}
			
		
}
		}}
