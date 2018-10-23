package client;
public class Throw_exception{  
	  
	   static void validate(int age)throws InvalidbikeException{  
	     if(age<18)  
	      throw new InvalidbikeException("no petrol");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(13);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("finish...");  
	  }  
	}
class InvalidbikeException extends Exception{  
	InvalidbikeException(String s){  
	  super(s);  
	 }  
	}