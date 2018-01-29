package tricky;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueInitialCapacity {

	public static void main(String[] args) {
PriorityQueue q=new PriorityQueue(2,new MyComparator());
q.offer("a");
q.offer("c");
q.offer("b");

System.out.println(q);
	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
       String s1=(String)o1;
       String s2=o2.toString();
       
		
		return s2.compareTo(s1);
	}
	
}