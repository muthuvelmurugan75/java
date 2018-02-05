package tricky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Passing_HashMap_In_To_List {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put (1, "Mark");
		map.put (2, "Tarryn");
		List<String> list = new ArrayList<String>(map.values());
		for (String s : list) {
		    System.out.println(s);
		}
	}

}
