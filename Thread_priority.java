package com.practiceprograms.www;

public class Thread_priority extends Thread {
	public void run(){
		System.out.println("current thread is"+Thread.currentThread().getName());
		System.out.println("thread priority is"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {

		Thread_priority t1=new Thread_priority();
		Thread_priority t2=new Thread_priority();
		Thread_priority t3=new Thread_priority();

		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
