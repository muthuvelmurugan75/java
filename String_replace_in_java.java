package com.tricky.www;

public class String_replace_in_java {
	public static void main(String[] args) {
	      String org= "This is my company";
	      String [] temp=org.split(" ");
	      int len=temp.length;
	      String ne = "";
	      for(int i=0;i<len;i++)
	      {
	          if(temp[i].matches("company"))
	              temp[i]="enlarge world";
	          ne=ne+temp[i]+" ";

	      }
	        System.out.println(ne);
	    }

}
