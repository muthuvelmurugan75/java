package com.muthuvel.www;
public class Threadclass {
public static void main(String[] args) throws InterruptedException   {
		Thread t1=new Thread(()->
		{
			for(int i=0;i<5;i++){
				System.out.println("childclass"+Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			});
		Thread t2=new Thread(()->
		{
			for(int i=0;i<5;i++){
				System.out.println("parentclass");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t1.start();
		
		t1.join();
		t2.join();
		System.out.println("bye muthu");
		System.out.println(t1.isAlive());
		
	

}
}
