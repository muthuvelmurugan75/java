package com.work.www;

public class LocalInnerClass {
	private int data=606;
	void method(){
		class Local{
			void display(){
				System.out.println(data);
			}
			
			
		}
		Local l=new Local();
		l.display();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass lc=new LocalInnerClass();
		lc.method();
	}

}
