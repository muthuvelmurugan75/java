package com.practiceprograms.www;

public class Naming_Thread extends Thread {
	public void run(){
		System.out.println("running");
	}

	public static void main(String[] args) {

		Naming_Thread t1=new Naming_Thread();
		Naming_Thread t2=new Naming_Thread();
		
		t1.start();
		System.out.println(t1.getName());
		t2.start();
		System.out.println(t2.getName());
		System.out.println("after");
		t1.setName(" t1:muthuvel");
		System.out.println(t1.getName());
		
	}

}
