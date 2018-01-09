package tricky;

import java.util.ArrayList;
import java.util.List;

public class Find_1s_in_array1_9_18 {

	public static void main(String[] args) {
        int c=0,a=1,k=0,l=0,m=0,b=0,d1=0,d2=0,d3=0;

int arr[]={1,2,3,4,1,2,1};
List ll=new ArrayList();
Object n=null;
for(int i=0;i<arr.length;i++){
	
	if(arr[i]==1){
		ll.add(i);

		//System.out.println(i);
	}
}
Object []array=ll.toArray();

for(int i=0;i<array.length;i++){
	if(i==0){
	d1=(int) array[i];	
	}
	if(i==1){
		d2=(int)array[i];
	}
	if(i==2){
		d3=(int)array[i];
		
	}
	
	//System.out.println(array[i]);
}
l=d2-d1;
m=d3-d2;
System.out.println("distance="+l);
System.out.println("distance="+m);

	}

}
