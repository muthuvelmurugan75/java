package corejava;

public class FirstJava {

	public static void main(String[] args) {
int arr[]={2,3,4,5,6,4,3};
int n=arr.length-1;
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(arr[j]==arr[i]){
			for(int k=j;k<n;k++){
				arr[k]=arr[k+1];
			}
			n--;
		}
		else{
j++;
		}
	}
}
for(int i=0;i<arr.length;i++){
	System.out.print(arr[i]);
}
	}

}
