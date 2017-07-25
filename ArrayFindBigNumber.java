package com.Contacts.www;

public class ArrayFindBigNumber {

	public static void main(String[] args) {
int arr[]={1,2,3,9,76,6,5,0};
int temp=arr[0],max=arr[0];
for(int i=0;i<arr.length;i++){
	
	temp=arr[i];
	if(temp>max){
		max=temp;
	}
	
}

System.out.println(max);
	}

}
