package com.tricky.www;

public class SwapOddEvenPositionCharacters {

	public static void main(String[] args) {
		char  arr[]={'u','m','h','t','u'};
		char t =0;
			for(int j=0;j<arr.length-1;j++){
				t=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=t;
			t=arr[j++];
		}
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]);
		}
	}

}
