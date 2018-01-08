package tricky;
import java.util.*;
import java.io.IOException;
import java.util.Arrays;

public class RgsConstructionTechnology {
	public static void main(String[] args) throws IOException {
		int  arr[]={7,7,8,6,1,2,3,6,6,7,8,8};
		int count=0;
		List ll=new ArrayList();
		List ll1=new ArrayList();
		List ll2=new ArrayList();
		Collections.sort(ll2);
		for(int i=1;i<1000;i++) {
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i){
					count++;
					}
				}
			if(count!=0 ){
				ll.add(count);
				ll1.add(i);
				ll2.add(count);
				System.out.println(i+"="+count);
				count=0;
				}
			}
		Object n = null;
		Object[] array2=	ll.toArray();
		ll2.toArray(array2);
		Collections.sort(ll2);
		for(int i=0;i<array2.length;i++){
			if(i==0){
				n=array2[i];
				System.out.println("minimum  count number from the list"+"="+array2[i]);
				}
			}
		Object[] array=	ll.toArray();
		for(int m=0;m<array.length;m++){
			if(array[m]==n){
				Object[] array1=	ll1.toArray();
				Object i = 3;
				System.out.println(array1[m]);
				}
			}
		}
	}

		    
		    

		    
		   


		

		
		
	

		  
		  

	  
	  
	  
	  
	    
	  
	  
	 