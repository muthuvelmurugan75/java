package com.work.www;

public class Muthu {

	public static void main(String[] args) {
		String userInput="Muthuvel,thommaiJOHN";
		
		 String input = userInput.toLowerCase();// Make your input toLowerCase.
		    int[] alphabetArray = new int[26];
		    for ( int i = 0; i < input.length(); i++ ) {
		         char ch=  input.charAt(i);
		         int value = (int) ch;
		         if (value >= 97 && value <= 122){
		         alphabetArray[ch-'a']++;
		         }
		    }
		    for (int i = 0; i < alphabetArray.length; i++) {
		        if(alphabetArray[i]>0){
		          char ch = (char) (i+97);
		          System.out.println(ch +"  : "+alphabetArray[i]);   //Show the result.
		        }         
		   }
		  
		
		
		
	}

}
