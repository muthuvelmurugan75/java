package com.Contacts.www;

public class Lengthmethod {
static int c,nch,i;
	public static void main(String[] args) {
		Lengthmethod lm=new Lengthmethod();
		
String name="muthuvel";
nch=lm.len(name);
System.out.println(nch); 

		
	}
	
 int len(String n){
	try{
		for( i=0,c=0;i>=0;i++,c++)
			n.charAt(i);
	}
		
	catch(Exception e){
	}
	return c;

	}
	
}

