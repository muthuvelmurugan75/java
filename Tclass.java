package com.muthuvel.www;

public class Tclass implements Runnable {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Era i=new Era();
		Tclass in=new Tclass();
		Thread obj=new Thread(in);
		Thread obj1=new Thread(i);
		obj1.setPriority(1);
		obj.setPriority(10);
		System.out.println(obj1.getPriority());
		System.out.println(obj.getPriority());
		obj1.start();
		obj.start();
		obj1.join();
		obj.join();
		System.out.println("thommai");
		System.out.println(obj.isAlive());
		
		
	}
	public void run(){
		for(int i=0;i<5;i++){
		
		System.out.println("thread is running");
		}
		
		
		
	}
	
	
}
	class Era implements Runnable {
		public void run(){
			System.out.println("thread is run");
		}
		
		
	}


