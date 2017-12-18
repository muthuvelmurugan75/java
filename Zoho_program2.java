package com.tricky.www;

public class Zoho_program2 {
	public static void main(String[] args) {
		int y=0;
		int x=0;
		int c[]={8,7,6,5};
		int c1[]={1,2,3,4};
		int c2[]=new int[c.length+c1.length];
		for(int i=0;i<c2.length;i++){
			if(i%2==0||i==0){
				c2[i]=c[y];
				y++;
				}
			else{
				c2[i]=c1[x];
				x++;
				}
			}
		for(int k=0;k<c2.length;k++){
			System.out.print(c2[k]);
			}
		}
	}
	
	
	


