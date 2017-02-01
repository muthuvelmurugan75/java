package com.muthuvel.www;

public class Voteridexception extends Exception {
	int voterage;

	

	public Voteridexception(int age) {
		// TODO Auto-generated constructor stub
		this.voterage=age;
		agefinder(17);
	}
	
	

	public Voteridexception() {
		// TODO Auto-generated constructor stub
	}



	private void agefinder(int voterage) {
		// TODO Auto-generated method stub
		if(voterage<18){
			try{
				throw new Voteridexception(voterage);
			}
			catch  (Exception e){
				System.out.println("please check your age");
			}	
			
				
			
		}
		
	}

	
}
