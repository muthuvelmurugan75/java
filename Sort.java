package tricky;

public class Sort {
public static void main(String[] args) {
	
	int arr[]={3,5,8,1,2,11,6};
	int v=1,j=0,l=arr.length,max=arr[0],ref=1;
	for(int i=0;i<arr.length;i++){
		
if(arr[i]>max){
	max=arr[i];
	
}

	}
	
	
	
	
	for(int y=0;y<max;y++){
	for(int k=0;k<l;k++){

			if(arr[k]==ref){
				v++;
				System.out.println(arr[k]);
			}
			
			
	

			
		}
	ref++;

	}


	}

	
	
}

