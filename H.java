package com.contacts1.www;

import java.util.Scanner;

public class H{

public static void main(String[] args) {
	float a,b,result;
	char choice;
Scanner obj=new Scanner(System.in);
do{
System.out.println("enter the menu number");	

System.out.print("1:addition\n");
System.out.print("2.substraction\n");
System.out.print("3.multiplication\n");
System.out.print("4.division\n");

choice = obj.next().charAt(0);
try{
	

	switch(choice){
		case '1':System.out.print("enter the number");
		a=obj.nextFloat();
		b=obj.nextFloat();
		result=a+b;
		System.out.println("result="+result);
		break;
		case '2':System.out.print("enter a number");
		a=obj.nextFloat();
		b=obj.nextFloat();
		result=a-b;
		System.out.println("result="+result);
		break;
		case '3':System.out.print("enter a number");
		a=obj.nextFloat();
		b=obj.nextFloat();
		result=a*b;
		System.out.println("result="+result);
		break;
		case '4':System.out.print("enter a number");
		
		a=obj.nextFloat();
		b=obj.nextFloat();
		
	      
		    
		result=a/b;
		System.out.println("result="+result);
		break;
		case '5':System.exit(0);
		break;
		default:System.out.println("wrong choice");
break;

	}
}
catch(Exception e){
	System.out.println(" enter an valid number");
}
}
while(choice!=5);
}


}


