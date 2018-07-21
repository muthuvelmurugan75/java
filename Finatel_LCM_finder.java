package javaprogram;

public class Finatel_LCM_finder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int number=lcm(5);
System.out.println(number);
	}

	private static int lcm(int n) {
		int arr[]=new int[n];
		int i;
for(i=0;i<arr.length;i++){
	arr[i]=i+1;
}
i=0;
	while(i<arr.length){
		if(n%arr[i]==0){
		
			i++;
		}
		else{
			i=0;
			n++;
		}
	}
	return n;
	}

}
