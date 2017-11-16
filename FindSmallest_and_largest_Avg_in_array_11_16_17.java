package com.tricky.www;

public class FindSmallest_and_largest_Avg_in_array_11_16_17 {
public static void main(String[] args) {
	int[] arr = new int[] { 8, 8, 10,6, 8 };

	if (arr.length > 0)
	{
	int small = arr[0];
	int large = arr[0];
	for (int i = 0; i < arr.length; i++)
	{
	if (large < arr[i])
	{
	int tmp = large;
	large = arr[i];
	arr[i] = large;
	}
	if (small > arr[i])
	{
	int tmp = small;
	small = arr[i];
	arr[i] = small;
	}
	}
	System.out.println("smallest is " + small);
	System.out.println("largest is " + large);
	int sum= 0;
	for (int i = 0; i < arr.length;i++ )
	{
	if(arr[i] != small && arr[i] != large)
	{
	sum += arr[i];
	}
	}
	if (sum != 0)
	sum /= 3;

	System.out.println(" The Average of the numbers is " + sum);

	}
}
}
