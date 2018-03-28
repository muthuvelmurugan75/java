package tricky;
public class SecondLargestNumber{
	 public static void main(String [] args){
	   int count=0;
		 int j;
	   int value[]={5,10,15,20,25,5,10,20,30,36,40};
	   int max=value[0] ;
	    for(int i=1;i<value.length;i++){
		  if(max<value[i]){
		    max=value[i];	
		    count=count+1;
		    j=count-1;
		    count=value[i];
		
	     	System.out.println("first largest number "+  count +" second largest number "+ j);
		}
		}	
	}
	}
