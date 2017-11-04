package com.originallist.www;

public class Find_the_number_fibonacci_or_not {

	public static void main(String[] args) {
int number=9;
int a=0;
int b=1;
int c=0;


while(c<number){
	 c=a+b;

	
	a=b;
	b=c;
}
	if(c==number){
		System.out.println("fibonacci");
	}
	else{
		//System.out.println(c);

		System.out.println("not a fibonacci");
	}
		
	
}
	
	

}
