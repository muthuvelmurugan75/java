package tricky;

import java.util.*;

public class Reverse_Array_List {

    public static void main(String[] args) {
       List<Integer> a = new ArrayList<Integer>();
       a.add(2);
       a.add(5);
       a.add(4);
       a.add(6);
       a.add(8);
       a.add(3);
       a.add(1);
       a.add(9);
       a.add(7);
       System.out.println("Elements before sorting: ");
       System.out.println(a);
       int t=a.size();
           for (int j = 0; j < a.size()/2 ; j++) {
                  int temp = a.get(j);
                  a.set(j, a.get(t-1-j));
                  a.set(t-1-j, temp);
               
           }
       
       System.out.println("Elements After sorting (in Ascending order): ");
       System.out.println(a);
    }

}