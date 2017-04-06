package com.work.www;
abstract class person{
	abstract void eat();
	
}

public abstract class AnonymousInnerclass extends person {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person(){
			void eat(){
				System.out.println("friuts");
			}
		};
		p.eat();
	}

	
		
	}
	
		
	


