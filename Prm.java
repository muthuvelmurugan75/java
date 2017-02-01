package com.muthuvel.www;

import java.util.Scanner;

public class Prm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
			  int i,m=0,z=0;    
			 Scanner in=new Scanner(System.in);
			 System.out.println("enter the number");
			 int n=in.nextInt();
			  m=n/2;    
			  for(i=2;i<=m;i++){    
			   if(n%i==0){    
			   System.out.println("Number is not prime");    
			   z=1;    
			   break;    
			   }    
			  }    
			  if(z==0)    
			  System.out.println("Number is prime");    
			}  
		
		

	}


