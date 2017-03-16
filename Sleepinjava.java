package com.roughwork.www;

public class Sleepinjava extends Thread {

	public static void main(String[] args) {

		Sleepinjava sj=new Sleepinjava();
		
		Thread t=new Thread(sj);
		t.start();
		sj.run1();

	}
	public void run(){
		
		for(int i=0;i<5;i++){
			try {
			Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("run is active");

		}
	}
	public void run1(){

		for(int i=0;i<5;i++){
			try {
			Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("running is active");

		}
	}


}
