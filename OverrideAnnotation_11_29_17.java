package com.tricky.www;

import java.util.ArrayList;
@FunctionalInterface
interface Abc{
	public void arrow();
	
}
public class OverrideAnnotation_11_29_17{

	public static void main(String[] args) {
B1 b=new B1();
b.show();

	}

}

class A1{
	@SuppressWarnings("unchecked")
	public void show(){
		System.out.println("show :a");
	}
}
class B1 extends A1{

	@Deprecated
	public void showe(){
		
	}
	@Override

	public void show(){
		System.out.println("b");
	}
}