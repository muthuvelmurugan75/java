package com.muthuvel.www;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Muthu in=new Muthu();
		in.start();
		synchronized(in){
		in.wait();
		System.out.println(in.total);
		}
		
		
		
		
	}

}
class Muthu extends Thread{
	int total=0;
	public void run(){
		
		synchronized(this){
	for(int i=0;i<=5;i++){
		 total=total+i;
	}}}
	
	
}