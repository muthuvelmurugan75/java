package com.muthuvel.www;

public class Parentthread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childthread in=new  Childthread();
		in.start();
		


for(int i=0;i<5;i++){
	System.out.println("parent thread");
}

}
}