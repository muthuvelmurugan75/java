package com.muthuvel.www;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter A value");
int a=obj.nextInt();
System.out.println("enter B value");
int b=obj.nextInt();




		
try{
	
	int c=a/b;
	 System.out.println(c);
	 
	 
	 try{
			
			 c=a/b;
			 System.out.println(c);
			 
			 					
					
			 		
			
			}catch(ArithmeticException e){
				System.out.println("please check values ");
				
			}
	 

	 
}
catch(ArithmeticException e){
	System.out.println("please check your numbers");
	
}
finally{
	System.out.println("finally executes the vlaue");
}

		
	 					
			
	 		
	
	}
	
		
			 					
	
	
			}
		
		
		
		