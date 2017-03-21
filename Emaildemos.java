package com.work.www;

public class Emaildemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] to={"antonyjoseph14313@gmail.com","muthuvelmurugan75@gmail.com"};
		if(Emailsender.sendmail("huvel75@gmail.com", "8760751648", "message to recipeints", to))
				System.out.println("email send succesfully");
		else 
			System.out.println("some errors occured");
				
	}

}
