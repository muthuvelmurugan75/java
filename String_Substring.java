package com.tricky.www;

public class String_Substring {


		public static void main(String[] args) {
		      String s="muthuvel";
		      for( int i=0;i<s.length();i++){
		    	  if(i%2!=0){
		    		  s=s.substring(0,i-1)+"@"+s.substring(i,s.length());
		    	  }
		      }
		      System.out.println(s);
		    }
}
