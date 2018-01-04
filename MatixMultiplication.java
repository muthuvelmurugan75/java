package tricky;
import java.util.Scanner;

public class MatixMultiplication
{
    public static void main(String args[])
    {
    	 
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of squared matrices");
       // n = input.nextInt();
        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{1,2},{4,5,7}};
        int[][] c = new int[2][3];
       /* System.out.println("Enter the elements of 1st martix row wise \n");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd martix row wise \n");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                b[i][j] = input.nextInt();
            }
        }*/
        
        System.out.println("Multiplying the matrices...");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                for (int k = 0; k < c.length; k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("The product is:");
        for (int i = 0; i < c.length; i++)
        {
            for (int j = 0; j < c.length; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}