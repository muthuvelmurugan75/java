package tricky;

import java.util.Scanner;

public class Print_Digit_Size_Number {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the digit number");
		int a=obj.nextInt();
		int arr[]={1,6,7,9,95,77};
        int t=arr[0],max=arr[0],sum=0,r=0,u=0;String s=" ";
        for(int i=0;i<arr.length;i++){
        	t=arr[i];
        	if(t>max){
        		max=t;
        		u=max;
        		}
        	}
        while(u!=0){
        	r=u%10;
        	sum++;
	        u=u/10;
	        }
        if(a==sum){
        	max=max+1;
        	}
        else{
        	for(int i=max;i>max-a;i--){
        		s+=i;
        		}
        	}
        for(int i=0;i<=a;i++){
        	char c=s.charAt(i);
        	System.out.print(c);
        	}
        }
	}
