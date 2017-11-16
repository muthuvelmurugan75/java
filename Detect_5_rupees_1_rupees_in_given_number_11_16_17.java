package com.tricky.www;

import java.util.Scanner;

public class Detect_5_rupees_1_rupees_in_given_number_11_16_17 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");
		int a=obj.nextInt();
		int y=0,z=0;
			y=a/5;
			System.out.print(y+"five rupees and "+" ");
			z=a%5;
			System.out.print(z+" one rupees");
		}
	}


