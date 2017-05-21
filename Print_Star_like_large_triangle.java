package com.practiceprograms.www;

public class Print_Star_like_large_triangle {

	public static void main(String[] args) {

		int k=16;int time=1;
		for(int i=0;i<5;i++){
			for(int j=0;j<k;j++){
				System.out.println(" ");
			}
			k=k-4;
			for(int j=0;j<time;j++){
				System.out.print("* ");
				time=time+2;
			}
			System.out.println();
		}
		
		
	}

}
