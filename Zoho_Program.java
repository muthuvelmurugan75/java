package com.tricky.www;

import java.util.Scanner;

public class Zoho_Program {

	public static void main(String[] args) {
		int arr[]={2,4,6,9,34,78,97};
		int m=0;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the element in the above program");
        int a =obj.nextInt();
        for(int i=0;i<arr.length;i++){
        	if(arr[i]==a){
        		//System.out.println(i);
        		for(int j=1;j<=arr[i+1];j++){
        			m=j*j;
        				if(m<=arr[i+1]){
        					System.out.println(m);
        				}
        			}
        		}
        	else{
        		System.out.println("ur number is out of list");
        	}
        	}
        	
        }
	}


