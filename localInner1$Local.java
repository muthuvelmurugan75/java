package com.work.www;
class inner{
	static int data=909;
	static class innerclass{
	void msgt(){
		System.out.println("data");
		
	}
		
	}
	public static void main(String[] args) {
		inner.innerclass obj=new inner.innerclass();
		obj.msgt();
		
	}
	
}