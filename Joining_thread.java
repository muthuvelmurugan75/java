package com.practiceprograms.www;

public class Joining_thread extends Thread {
	public void run(){
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(500);

			}
			catch(Exception e){
				System.out.println("exception occurs");
			}
			
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		Joining_thread t1=new Joining_thread();
		Joining_thread t2=new Joining_thread();
		Joining_thread t3=new Joining_thread();
		t1.start();
		try{
			t1.join();
		}
		catch(Exception e){
			System.out.println("exception ");
		}
		
		t2.start();
		t3.start();
	}

}
