package com.tricky.www;

public class Updated_Zoho_program2 {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9};
		int half=arr.length/2;
//System.out.println("half"+half);		
		
		int l=arr.length;
		//System.out.println(l);
		int c1[]=new int[half];
		for(int i=0;i<half;i++){
			c1[i]=arr[i];
			//System.out.println(first[i]);
		}
		int r=0;
		int rem=l-(half);
		//System.out.println("rem"+rem);
		int c[]=new int[rem];
		for(int j=arr.length-1;j>=half;j--){
			
			c[r]=arr[j];
			//System.out.print(first2[r]);
			r++;
		}
		//System.out.println(rem);
		int y=0;
		int x=0;
		//int c[]={8,7,6,5};
		//int c1[]={1,2,3,4};
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
	
	
	


