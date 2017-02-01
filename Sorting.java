package com.muthuvel.www;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a={1,4,2,3};
		int temp;int k, i;
		for ( i=0;i<a.length-1;i++){
			
			
			for(int j=0;j<a.length-1;j++){
				
				
				if (a[j]>a[j+1]){
					
				 temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				
				}
			}
		}
				for ( i=0;i<a.length;i++){
					
				
					System.out.println(a[i]);
				}
				
			
			
			
			
		
		
		
	}

}
