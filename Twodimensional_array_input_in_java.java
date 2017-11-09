package com.tricky.www;

import java.util.Scanner;

public class Twodimensional_array_input_in_java {
	public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter row");
	int a=obj.nextInt();
	System.out.println("enter column");
	int b=obj.nextInt();
	int [][] arr=new int [a][b];
	for(int i=0;i<a;i++){
		
		for(int j=0;j<b;j++){
			arr[i][j]=obj.nextInt();
		}
	}for(int k=0;k<arr.length;k++){
		for(int l=0;l<arr.length;l++){
			System.out.print(arr[k][l]);
		}
		System.out.println();
	}
	}
	}
	
	

