package com.originallist.www;

public class Main_Find_duplicate {

	public static void main(String[] args) {
int arr[]={2,3,4,5,6,4};
int n=arr.length-1;


for(int i=0;i<n;i++){
	for(int j=i+1;j<n;){
		if(arr[i]==arr[j]){
		for(int x=j;x<n;x++){
			arr[x]=arr[x+1];
		}
		n--;
		}
		else{
			j++;
		}
		
	}
	}
for(int y=0;y<n;y++){
	
		System.out.print(arr[y]+" ");
	}
}



}