package javaprogram;

public class Find_Second_LargestNumber_And_SecondSmallestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int arr[]={2,3,6,9,77,22};
int l1=arr.length-1,l2=arr.length-1;
int t=0;
for(int i=0;i<arr.length-1;i++){
	for(int j=0;j<arr.length-1;j++){
		if(arr[j]>arr[j+1]){
			t=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=t;
			
		}
	}
	
}
//System.out.println("outer"+l2);
for(int k=0;k<arr.length;k++,l2--){

//System.out.println(arr[l2]);
	

	
if(k==1){
		System.out.print(arr[k]+" "+arr[l2]);

	}
}
		
		
		
	}

}
