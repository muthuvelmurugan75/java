package com.muthuvel.www;

public class Outerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Outerclass principal=new Outerclass();
	Inner hod=new Outerclass().new Inner();
	hod.test();
	
new Outerclass().test();
	

	}
	void test(){
	Inner in=new Inner();
	in.test();
		System.out.println("xxx");
	}
		
		class Inner{
			
			
			void test(){
				System.out.println("java class postponed");
			}
			
		}
		

	

}
