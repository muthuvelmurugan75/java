package tricky;

import java.util.Arrays;
import java.util.Random;

public class Random_Array {

	public static void main(String[] args) {
int arr[]={3,6,88,8,9,6,4,4};
getRandom(arr);
	}
	public static void getRandom(int[] array) {
		for(int i=array.length-1;i>0;i--){
		    int rnd = new Random().nextInt(array.length);
	int t=array[i];
	array[i]=array[rnd];
	array[rnd]=t;
	
		}
	    System.out.println(	    Arrays.toString(array));
	   
	}
}
