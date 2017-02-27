package com.roughwork.www;

public class Printwithoutonenumber {

	public static void main(String[] args) {
int a []={12,23,34,56,78,90,78};
for(int i=0;i<=a.length;i++){
	if(a[i]==56){
		continue;
	}
	else{
		System.out.println(a[i]);
	}
}
		
	}

}
