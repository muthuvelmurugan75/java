package com.practiceprograms.www;

public class Synchronized_method_injava extends Thread {
public void run(){
table(1);


}
synchronized void table(int i) {

	int n=2;
	for(int i1=0;i1<5;i1++){
		System.out.println(i1);
}}
public static void main(String[] args) {
	for(int j=10;j<20;j++){
		System.out.println(j);
		Synchronized_method_injava t1=new Synchronized_method_injava();
		t1.start();
	}
}

}
 