package javaprogram;

public class ZOHO_PROGRAM_8_7_2018_print_all_next_letter_in_the_word {
/* input:abc   output:bcd     print the next letter in the word  this is for u   */
	public static void main(String[] args) {
		String name="muthu";
String s="";
		for(int i=0;i<name.length();i++){
			char c=name.charAt(i);
			printnext_letter(c);

		}
	}


	public static void printnext_letter(char c){
		char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		for(int i=0;i<arr.length;i++){
			if(arr[i]==c){
				i++;
				System.out.println(arr[i]);
			}
			}
		
		
	}
	
}
