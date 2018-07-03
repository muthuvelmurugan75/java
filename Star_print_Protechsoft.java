package storage;

public class Star_print_Protechsoft {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int size=5;
int s,i,j;
int space=size;
for(s=1;s<=size;s++){
	for(i=1;i<=s;i++){
		System.out.print("*");
	}
	for(j=space;j>1;j--){
		System.out.print("+");
	}
	for(i=s;i>=1;i--){
		System.out.print("&");
	}
	System.out.println();
	space--;
}
		
	}

}
