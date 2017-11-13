package com.tricky.www;

public class Pattern_Triangle_using_Numbers_11_13_17 {

	public static void main(String[] args) {
		int a=5;
		for(int i=1;i<a;i++){
			for(int j=a;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
