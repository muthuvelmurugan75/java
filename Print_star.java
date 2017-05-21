package com.practiceprograms.www;

import java.io.IOException;

public class Print_star {

	public static void main(String[] args) throws IOException {
		int alphabet=65;

for(int i=0;i<5;i++){

	for(int j=0;j<=i;j++){
		System.out.print((char)alphabet);
		alphabet++;

	}

	System.out.println();

}
		
		
	}

}
