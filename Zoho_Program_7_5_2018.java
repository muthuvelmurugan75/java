package javaprogram;

public class Zoho_Program_7_5_2018 {

	/*
	 input:a[]={4,3,,5,7}; b[]={1,2,-1,3};  output:5 3   7 1  concept is add two numbers from a and b array which is equal to x (i.e 8)  we print that numbers only,,,, this is for  u
	 */
	public static void main(String[] args) {
int a []={4,3,5,7};
int b[]={1,2,-1,3};
int x=8;
for(int i=0;i<a.length;i++){
	for(int j=0;j<b.length;j++){
		if(a[i]+b[j]==x){
			System.out.println(a[i]+" "+b[j]);
		}
	}
}
	}

}
