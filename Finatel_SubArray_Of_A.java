package javaprogram;

public class Finatel_SubArray_Of_A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int a[]={1,2,3,6,7};
int b[]={1,2,3};
int c=0;
for(int i=0;i<a.length;i++){
	for(int j=0;j<b.length;j++){
		if(b[j]==a[i]){
			c++;
		}
	}
}
if(c==b.length){
	System.out.println("equal");
}
else{
	System.out.println("not equal");
}

	}

}
