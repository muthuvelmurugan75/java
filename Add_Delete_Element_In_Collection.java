package com.tricky.www;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Add_Delete_Element_In_Collection {
	public static void main(String[] args) {
	      Scanner obj=new Scanner(System.in);
		   ArrayList<String> arrlist = new ArrayList<String>(5);
           System.out.println("Enter 3 Elements");
		   for(int i=0;i<3;i++){
			   arrlist.add(obj.nextLine());	
			   }
		   System.out.println("Size of list: " + arrlist.size());

		   for (String value : arrlist) {
		   System.out.println("Value = " + value);
		   }  
			
		   System.out.println("enter what element to remove");
		   arrlist.remove(obj.nextLine());

		   System.out.println("Now, Size of list: " + arrlist.size());
			
		   for (String value : arrlist) {
		   System.out.println("Value = " + value);
		   }  
		   }

}
