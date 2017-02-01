package com.muthuvel.www;

import java.util.Scanner;

public class Prmnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,m;
Scanner obj=new Scanner(System.in);
System.out.println("enter the number");
int n=obj.nextInt();


for( i=2;i<=n;i++){
	m=n%i;
	
		if(m==1){
		System.out.println(" prime");
		break;
		}else{
			System.out.println(" not prime");
			break;
		}
	
}

	}

}
