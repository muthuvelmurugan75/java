package tricky;

import java.util.*;

public class Hashmap{

	public static void main(String[] args) {
HashMap hm=new HashMap();
hm.put(101, "muthi");
hm.put(101, "muthu");
hm.put(100, "raja");
System.out.println(hm);//in 101 place muthu will be print
System.out.println(hm.get(101));
Set<Map.Entry<Integer, String>> s=hm.entrySet();
for(Map.Entry<Integer, String> v:s){
	System.out.println(v.getKey()+":"+v.getValue());
}
	}

}
