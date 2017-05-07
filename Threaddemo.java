package com.practiceprograms.www;

public class Threaddemo {

	public static void main(String[] args) {
		Mythread obj=new Mythread();
		obj.start();
for(int i=0;i<10;i++){
	System.out.println("main thread");
}
	}

}
