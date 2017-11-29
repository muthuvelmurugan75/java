package com.tricky.www;

public class FindMiddleNumberInArrayInjava11_29_17 {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9,9,7};
		int c=0;
		for(int i=0;i<a.length;i++){
			c++;
		}
		
		int d=c/2;
		//System.out.println(d);
		for(int i=0;i<a.length;i++){
		if(i==d){
			System.out.println(a[i]);
		}
		}

	}

}
