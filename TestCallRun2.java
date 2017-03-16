package com.roughwork.www;

public class TestCallRun2 {

		 public void run(){  
			  for(int i=1;i<5;i++){  
			    try{Thread.sleep(400);}catch(InterruptedException en){System.out.println(en);}  
			    System.out.println(i);  
			  }  
			 }  
			 public static void main(String args[]){  
			  TestCallRun2 t1=new TestCallRun2();  
			  TestCallRun2 t2=new TestCallRun2();  
			   
			  t1.run();  
			  t2.run();  
			 }  
			
	}


