package tricky;
public class ThirdLargest {
	 
	public static void main(String[] args) {
 
		int arr[] = { 14, 46, 47, 86, 92,89, 52, 48, 36, 66, 85,78 };
		int largest = arr[0];
		int secondlargest = arr[0];
		int thirdlargest=arr[0];
		
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
			    thirdlargest = secondlargest;
			    secondlargest = largest;
			    largest = arr[i];
			} else if (secondlargest < arr[i]) {
			    thirdlargest = secondlargest;
			    secondlargest = arr[i];
			} else if (thirdlargest < arr[i]) {
			    thirdlargest = arr[i];
			}
		}
 
		System.out.println("\nSecond largest number is:" +thirdlargest );
 
	}
}