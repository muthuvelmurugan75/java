package com.muthuvel.www;

public class Payilagam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Payilagam in=new Payilagam();
		
		Javatraining obj=new Payilagam().new Javatraining();
		
		obj.test();
		new Payilagam().test();
		
	}
	void test(){
		Javatraining obj=new Javatraining();
		obj.test();
		System.out.println("conduct test");
		
	}
	
	
	class Javatraining{
		
		
		void test(){
			System.out.println("xam cancelled");
		}
		
	}

}
