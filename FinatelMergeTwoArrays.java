package com.technique.www;

public class FinatelMergeTwoArrays {
		   public static void main(String[] args) {
		      int[]a = {9,7,3,5,1};
		      int[]b = {2,4,6,8,11,10};
		      int[]c = new int[a.length+b.length];
		      int count = 0;int v=1;

		      
		      for(int i = 0; i<a.length; i++) { 
		         c[i] = a[i];
		         count++;
		      } 
		      for(int j = 0;j<b.length;j++) { 
		         c[count++] = b[j];
		        
		         }
		      
		      for(int i = 0;i<c.length;i++){
		    	  for(int k=0;k<c.length;k++){
			        	 if(c[k]==v){
				        	System.out.println(c[k]); 
					         
				      }
			        	   
		      }
		    	  v++;	   
		   } 
		   
		}

}