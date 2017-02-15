package com.Murugan.www;

import java.util.Scanner;

public class Numbertoword {
	
	
	public enum hundreds {oneHundred,twoHundred,threeHundred,fourHundred,fiveHundred,sixHundred,sevenHundred,eightHundred,nineHundred}
	public enum tens {twenty,thirty,fourty,fifty,sixty,seventy,eighty,ninety}
	public enum ones {one,two,three,four,five,six,seven,eight,nine}
	public enum denom{thousands,lakhs,crores}
	public enum splnums{ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen}
	public static String text="";
	

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number convert to words");
		long num=obj.nextInt();
		int rem=0,i=0;
		while(num>0){
		if(i==0){
			rem=(int) (num%1000);
			pt(rem);
			num=num/1000;
			i++;	
	}
		else if(num>0){
			rem=(int) (num%100);
			if(rem>0)
				
			text=denom.values()[i-1]+""+text;
			pt(rem);
		   num=num/100;
			i++;
		}
		}
		if(i>0)
System.out.println(text);
		else{
			System.out.println("zero");
		}
		
		
		}
		
		
		
		
	


	private static void pt(int rem) {
if(!(rem>9 && rem<19)){
	if(rem%10>0)
		getones(rem%10);
	 rem=rem/10;
	 if(rem%10>0)
			gettens(rem%10);
		 rem=rem/10;
		 if(rem%10>0)
				gethundreds(rem%10);
			 rem=rem/10;
	
}
else
	getsplnums(rem%10);
		
		
		
		
		
		
		
		
		
	}







	private static void getsplnums(int j) {

		
	text=splnums.values()[j]+""+text;	
		
	}







	private static void gethundreds(int k) {
		// TODO Auto-generated method stub
		text=hundreds.values()[k-1]+""+text;
	}







	private static void gettens(int l) {
		// TODO Auto-generated method stub
		text=tens.values()[l-2]+""+text;	}







	private static void getones(int m) {
		// TODO Auto-generated method stub
		text=ones.values()[m-1]+""+text;
		
	}

}
