package tricky;

public class KthLargest_element {

	public static void main(String[] args) {
int a[]={2,4,6,3,1,8,88,99,5,77};
int lar[]=new int[6];
int max=a[0],index=0;
for(int i=0;i<5;i++){
	max=a[0];
	for(int j=1;j<a.length;j++){
		if(max<a[j]){
			max=a[j];
			index=j;
		}
	}
	lar[i]=max;
    a[index] = Integer.MIN_VALUE;

	System.out.println("largest "+i+" = "+lar[i]);
}
	}

}
