package com.tricky.www;

public class ConvertStringToInteger_11_15_17 {

	public static void main(String[] args) {
		ConvertStringToInteger_11_15_17 m=new ConvertStringToInteger_11_15_17();
		m.getNumber("123");
		
		
}
	public static void getNumber(String number) {
		
	    int result = 0;

	    for (int i = 0; i < number.length(); i++) {
	        result = result * 10 + number.charAt(i) - '0';
		    System.out.println(result );

	    }
	    
	}
	}


