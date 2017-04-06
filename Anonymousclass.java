package com.work.www;
interface players{
	void indians();
}

public class Anonymousclass {

	public static void main(String[] args) {
		players p=new players(){
			public void indians(){
				System.out.println("good play");
				
			}
		};
		p.indians();

	}

}
