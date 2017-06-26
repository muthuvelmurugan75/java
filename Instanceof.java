package com.Contacts.www;

public class  Instanceof{
	 public static void main(String[] args) {
	        String name = "java";
	 
	        if (name instanceof String) {
	            System.out.println("an instance of String class");
	        }
	 
	        // test for subclass of Object
	        if (name instanceof Object) {
	            System.out.println("an instance of Object class");
	        }
	 
	        // test for subclass of an interface
	        if (name instanceof CharSequence) {
	            System.out.println("an instance of CharSequence interface");
	        }
	    }
}
