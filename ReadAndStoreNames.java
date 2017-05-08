package com.practiceprograms.www;


		import java.util.Scanner;

		public class ReadAndStoreNames {

		public static void main(String[] args) throws Exception {
		    Scanner scan = new Scanner(System.in);
		    //take 10 string values from user
		    System.out.println("Enter 10 names: ");
		    


		    String [] names = new String[10];
		    //store the names in an array
		    for (int i = 0; i < 10; i++){
		        names[i] = scan.nextLine();
		        }
		    //sequentially print the names and upperCase them
		    for (String i : names){
		        System.out.println(i.toUpperCase());
		        }

		    scan.close();

		}

		
		
	
}
