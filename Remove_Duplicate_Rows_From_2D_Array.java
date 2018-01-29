package tricky;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicate_Rows_From_2D_Array {

	public static void main(String[] args) {
		 int arr[][]={{2,7,8},{2,7,8},{8,9,9},{2,7,8},{8,9,9},{1,2,3},{1,2,3},{6,9,0}};
		   
		removeDuplicateRow(arr);
	}
	public static int[][] removeDuplicateRow(int[][] testArr)
    {
       
        HashSet<String> hashSet = new HashSet<String>();
        int[][] result = new int[8][3];
        int i = 0;
        for(int[] a : testArr)
        {
            System.out.println(Arrays.toString(a));
            System.out.println(hashSet.contains(a));
            if(!hashSet.contains(Arrays.toString(a))){
                hashSet.add(Arrays.toString(a));
                result[i] = a;
            }
            i++;
        }

        System.out.println("old array : "+Arrays.deepToString(testArr));
        System.out.println("new array : "+Arrays.deepToString(result));

        return result;
    }
}
