package tricky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBraceInitialization {

	public static void main(String[] args) {
/*List<Integer> ll=Arrays.asList(2,3,5);
for(int i:ll){
	System.out.println(i);
}
*/
		List<String> s=new ArrayList<String>()
				{{
				add("jos");
				add("muthu");
				
				}};
				for(String f:s){
					System.out.println(f);
				}
	}

}
