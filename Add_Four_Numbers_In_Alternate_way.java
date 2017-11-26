package com.tricky.www;

import java.util.Scanner;

public class Add_Four_Numbers_In_Alternate_way{

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	    int	ar[]={1,2,3,4};
		
        int t=0,t1=0,t2=0,t3=0,k=0;
        for(int i=0;i<ar.length;i++){
        for(int x=0;x<ar.length;x++){
             if(ar[x]==ar[i]){
            	 continue;
             }
           if(i==0){
        	   t+=ar[x];
           }
           if(i==1){
        	 t1+=ar[x];
           }
           if(i==2){
          	 t2+=ar[x];
             }
           if(i==3){
          	 t3+=ar[x];
             } 

        }
        }
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
	    System.out.println("Enter The Number");
	    int myNumber=obj.nextInt();
        int numbers[]={t,t1,t2,t3};
    	int distance = Math.abs(numbers[0] - myNumber);
    	int idx = 0;
    	for(int c = 1; c < numbers.length; c++){
    	    int cdistance = Math.abs(numbers[c] - myNumber);
    	    if(cdistance < distance){
    	        idx = c;
    	        distance = cdistance;
    	    }
    	}
    	int theNumber = numbers[idx];
    	System.out.println(theNumber);
	
	}
	}


