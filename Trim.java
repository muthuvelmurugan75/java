package com.work.www;

public class Trim {

	public static void main(String[] args) {
		String s="   Sachin muthuvel  "; 
		
		System.out.println(s.startsWith("Sa"));
		System.out.println(s.endsWith("k"));
		System.out.println(s);//  Sachin    
		System.out.println(s.trim());//Sachin 
		String s2=s.intern();
		System.out.println(s2);
		int a=10;  
		String s4=String.valueOf(a);  
		System.out.println(s4+10);  
		String s1="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=s1.replace("Java", "kava") ;   
		System.out.println(replaceString);    
		
		
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.insert(1, "muthu") ;
		System.out.println(sb);//prints HJavaello 
		
		
		StringBuffer sb1=new StringBuffer("Hello");  
		sb1.replace(1, 4, "jos") ;
		System.out.println(sb1);//prints HJavalo  
		}  
	}


