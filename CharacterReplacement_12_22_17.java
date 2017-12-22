package com.tricky.www;

public class CharacterReplacement_12_22_17 {

	public static void main(String[] args) {
		String org= "This car is my car";
	      char [] temp=org.toCharArray();
	      int len=temp.length;
	      String ne = "";
	      for(int i=0;i<len;i++)
	      {
	          if(temp[i]=='c')
	              temp[i]='b';
	          ne=ne+temp[i]+" ";

	      }
	        System.out.println(ne);
	}

}
