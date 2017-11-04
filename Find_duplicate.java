package com.originallist.www;

public class Find_duplicate {

	public static void main(String[] args) {
int arr[]={2,3,4,5,6,4,3};
int n=arr.length-1;
int a[]=new int[n];

for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(arr[i]==arr[j]){
		for(int x=j;x<arr.length-1;x++){
			arr[x]=arr[x+1];
		}
		}
		
	}
	}
for(int y=0;y<a.length-1;y++){
	
		System.out.print(arr[y]);
	}
}



}