package com.Contacts.www;

public class ArraySortingWithoutUsingSortingMethod {

	public static void main(String[] args) {
int arr[]={1,2,3,5,91,1,3,7,9};
		int max=arr[0],min=arr[0],temp=arr[0];
		for(int i=0;i<arr.length;i++){
			temp=arr[i];
			if(temp>max){
				max=temp;
			}
			if(temp<min){
			min=temp;
			}

		}
		System.out.println(min);
		System.out.println(max);

	}

}
