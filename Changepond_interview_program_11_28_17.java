package com.tricky.www;

public class Changepond_interview_program_11_28_17 {
	  
	     public static void main(String[] args) {
	         int arr[]={1,2,3,6,1,567,1};
	         int c=0,a=1,k=0,l=0,m=0,n=0,b=0,d1=0,d2=0,d3=0;
	         for(int i=0;i<arr.length;i++){
	        	 if(arr[i]==a){
	        		 c++;
	        	 
	        	 if(c==1){
	        		 k=i;
	        	//System.out.println(k);	 
	        	 }
	        	 if(c==2){
	        		 l=i;
	        		//System.out.println(l); 
	        	 }
	        	 if(c==3){
	        		 m=i;
	        		//System.out.println(m); 
	        	 }
	         }
	   
	         }
	         d1=l-k;
	 	    d2=m-l;
	 	    System.out.println("d1 distance"+d1);
	 	    System.out.println("d2 distance"+d2);
	         }
	     
}