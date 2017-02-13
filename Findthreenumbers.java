package com.payilagam.www;

import java.util.Scanner;

public class Findthreenumbers {

	public static void main(String[] args) {
		int temp=0,sum=0,temporary=0,mind=0,ramp=0;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value");
		int a,b,c,d;
		a=obj.nextInt();
	    b=obj.nextInt();
		c=obj.nextInt();
		d=obj.nextInt();
		
			
			if(a!=0)
					sum=b+c+d;
			System.out.println(sum);
			
			if(b!=0)
								 temp=c+d+a;
				System.out.println(temp);
			
			if(c!=0)
				
				 temporary=d+a+b;
				System.out.println( temporary);
			
			if(d!=0)
				
				 ramp=a+b+c;
				 System.out.println(ramp);
			
			System.out.println("enter a  number");
			 mind=obj.nextInt();
			 		for(;;){		 
				if (ramp<mind){
					
					System.out.println(ramp);
					break;
					
				}
				if(ramp>mind){
					System.out.println(ramp);
					break;
				}
					
					if(sum<mind){
						System.out.println(sum);
					break;
					}					
							if(sum>mind){
								System.out.println(sum);
								break;
							}
							if(temporary>mind){
								System.out.println(temporary);
								break;
							}
							if(temporary<mind){
								System.out.println(temporary);
								break;
							}
							if(temp>mind){
								System.out.println(temp);
								break;
								
							}
							if(temp<mind){
								System.out.println(temp);
								break;
							}
			 		}
				}
			 
	
	
	}
			 
							
									

			
			
	
	

		
		
		
		
		
			
		
		
		
		
			
			
	


