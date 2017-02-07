package com.Murugan.www;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a name");
		String str=obj.nextLine();
		
		for(int i=0;i<str.length();i++)
	{
			
			char ch=str.charAt(i);
			if((ch=='a')||
					
					(ch=='e')|| (ch=='i')|| (ch=='o')|| (ch=='u')){
				
				System.out.println(ch);
			}
			
		
	}

}
}