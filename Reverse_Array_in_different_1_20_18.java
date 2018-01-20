package tricky;

import java.util.Random;

public class Reverse_Array_in_different_1_20_18 {
		public static void main(String[] args) {
			Random r=new Random();
			int[] arr = { 8, 8, 10,6, 8,99,7,77,66,88 };
			int n=arr.length;
for(int i=0;i<n/2;i++){
int t=arr[i];
arr[i]=arr[n-1-i];
arr[n-1-i]=t;

}
for(int j=0;j<7;j++){
	System.out.print(Math.random()+",");

}
		
		}
		}


