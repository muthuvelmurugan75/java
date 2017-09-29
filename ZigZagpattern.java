package com.java.www;

public class ZigZagpattern {
	public static void main(String[] args) {

		char ch[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(int i=0;i<5;i++)
		{
		for(int j=0;j<ch.length;j++)
		{
		if(i==j || i+j==8 || j-i==8 || i+j==16 || j-i==16 || i+j==24 || j-i==24)
		System.out.print(ch[j]);
		else
		System.out.print(" ");
		}
		System.out.println();
		}

		}
}
