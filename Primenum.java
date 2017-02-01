package com.muthuvel.www;

import java.util.Scanner;

public class Primenum {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int i,m=0, z=0;
	
	
	m=n/2;
	for(i=2;i<=n;i++){
		{
		if(n%2==0){
		System.out.println("not a prime");
		z=1;
		break;
		
		}
		if(z==0){
			System.out.println("prime");
			break;
		}
		
			
			
		}
	}
	
	
	
}
}
