package com.tricky.www;

import java.util.regex.Pattern;

public class StringreverseInbuildmethod {

	public static void main(String[] args) {
String s1="welcome to geeks for geeks";
System.out.println(revwords(s1));
String s2="i love java programming";
System.out.println(revwords(s2));
	}

	public static String revwords(String str) {
Pattern p=Pattern.compile(" ");
String []temp=p.split(str);
		String result="";
		for(int i=0;i<temp.length;i++){
			if(i==temp.length-1){
				result=temp[i]+result;
			}
			else{
				result=" "+temp[i]+result;
			}
		}
		return result;
	}

}
