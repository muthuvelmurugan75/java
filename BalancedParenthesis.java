package com.tricky.www;

public class BalancedParenthesis {

	public static void main(String[] args) {
		char [] arr={'{','[','(','}',')',']'};
		int curlybrace = 0;
		int roundBrace = 0;
		int squareBrace = 0;
		int test=0;
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				if(test==0){
					if(arr[i]=='{'&& arr[j]=='}'){
					curlybrace=1;
				}
					if(arr[i]=='['&& arr[j]==']'){
						squareBrace=1;
					}
					if(arr[i]=='('&& arr[j]==')'){
						roundBrace=1;	
					}
					
			}
		}
	
	}
		if(curlybrace==1&& roundBrace==1&& squareBrace==1 ){
			System.out.println("balanced");
			test=1;
		}
		else{
			System.out.println("not balanced");
test=1;
		}

}
}
