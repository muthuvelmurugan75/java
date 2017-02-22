package com.muthuvel.www;

import java.util.Scanner;

public class Primenumberbwtwonumbers {
public static void main(String[] args) {
	int i,f=0;

	Scanner in=new Scanner(System.in);
	System.out.println("enter lower limit number");
	int a=in.nextInt();
	System.out.println("enter a upper limit number");
	int b=in.nextInt();
	for(i=a;i<b;i++){
		for(int j=2;j<i;j++){
			if(i%j==0){
				f=0;
				break;
			}
			else{
				f=1;
				
			}
			
		}
		if(f==1){
			System.out.println(i);
		}
	}
	
	
	
		
			
			
		
	
	
	
	
}
}
