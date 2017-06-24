package com.Contacts.www;

import java.io.IOException;
import java.util.Scanner;

public class Ten_names_word_occurance_counter {
	  public static void main(String[] args) throws IOException {
		  String niceoutput="";
		  Scanner scan = new Scanner(System.in);
		  int count=0;
		    //take 10 string values from user
		    System.out.println("Enter 10 names: ");
		    


		    String [] names = new String[10];
		    //store the names in an array
		    for (int i = 0; i < 10; i++){
		        names[i] = scan.nextLine();
		        
		        }
		    
		    for(String s:names){
		    	niceoutput+=s;
		    }
		        char[] c = niceoutput.toCharArray();
		       
			   String  str=new String(c);
			   System.out.print(str);
			    
			   for(char i='a';i<='z';i++)
			   {
			   for(int j=0;j<str.length();j++)
			   {
			   if(str.charAt(j)==i){
			   count++;
			   }
			   }
			   if(count!=0){
			   System.out.println(i+"="+count);
			   count=0;
		    			
		    		}
		    	
		    	
			    	

			    	//System.out.println("result");
			    	//System.out.print(result);
			    	
			    }
			
	    	
  
	
	  }} 
		    
		    

		    
		   


		

		
		
	

		  
		  

	  
	  
	  
	  
	    
	  
	  
	  
	
