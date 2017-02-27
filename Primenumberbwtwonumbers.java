package com.roughwork.www;

public class Primenumberbwtwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,f=0;
for(i=4234;i<5234;i++){
	for(int j=2;j<i;j++){
		if(i%j==0){
			f=0;
			break;

		}
		else{
			f=1;
		}
			
		
	}
	if(f==1){
		System.out.println(i);

	}
}
	}

}
