package tricky;

public class Longest_Sequence_Number {

	public static void main(String[] args) {
		int arr[]={2,4,6,8,7,8,9,10,7,5};
		int store[]=new int[arr.length];
		int count=1,j=0, t=0,m1=0,m2=0,t1=0,t2=0;
		for(int i=1;i<1000;i++) {
			for( j=0;j<arr.length-1;j++)
			{
				if(arr[j]+i==arr[j+1]){
					count++;
					t=j+1;
					
					
					}
				if(arr[j]+i!=arr[j+1]&& count!=0){
					m1=t;
					m2=count;
					t2=t1;
					System.out.println("i value="+i+""+"j value="+t+""+"count="+count);
					count=0;
				}
				}
			
			
			}
	}

}
