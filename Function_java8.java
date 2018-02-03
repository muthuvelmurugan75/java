package tricky;

import java.util.function.Function;

public class Function_java8 {
public static void main(String[] args) {
	Function <String,String> f=(n)-> {
	return"name received:"+n;	
	};
	System.out.println(f.apply("muthuvel"));
	System.out.println(f.apply("ganesh"));

}
}
