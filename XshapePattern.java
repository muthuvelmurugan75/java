package tricky;

public class XshapePattern {

	public static void main(String[] args) {
		int j;
for(int i=1;i<=5;i++){
	for( j=1;j<i;j++){
		System.out.print("-");	

	}
	for(int l=6;l>j;l--){
		System.out.print(" ");
		
	}
	for(int k=1;k<2;k++){
		System.out.print("*");
		
	}
	
	
	for(int m=1;m<2;m++){
		System.out.print("*");
	}
	
	System.out.println();

}
	}

}
