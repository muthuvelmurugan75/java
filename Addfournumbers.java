package com.Murugan.www;

public class Addfournumbers {

	public static void main(String[] args) {
int a []={1,2,3,4};
for(int i=0;i<3;i++){
	int b=a[i]+a[i+1]+a[i+2]+a[i+3];
	System.out.println(b);
	int c=a[i-1]+a[i+1]+a[i+2]+a[i+3];
	System.out.println(c);
	
}
		
		
		
	}

}
