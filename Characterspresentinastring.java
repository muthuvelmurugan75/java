package com.work.www;

import java.io.IOException;
import java.util.Scanner;



public class Characterspresentinastring
{
public static void main(String arg[]) throws IOException
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a string");
	String string=obj.nextLine();
	
	char ch=(char) System.in.read();
	
	System.out.println(ch);
	int nch=0;
	for(int i=0;i<string.length();i++){
		char c=string.charAt(i);
		
		if(c==ch){
			nch++;
			
		}
	}
	System.out.println(nch);
	
	

}}