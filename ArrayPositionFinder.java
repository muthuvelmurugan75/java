package com.Contacts.www;

import java.util.Scanner;

public class ArrayPositionFinder {

	public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
System.out.println("enter an element");
int a = obj.nextInt();
int arr[]={1,8,0,8,6,7,4};
for(int i=0;i<arr.length;i++){
	if(arr[i]==a){
		System.out.println(i);
	}
}
		
	}

}
