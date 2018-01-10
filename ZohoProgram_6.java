package tricky;

public class ZohoProgram_6 {
	public static void main(String[] args)
    {
        int r = 6;
        String s="welcometozohocorporation";
 char y[]=s.toCharArray();
        char arr[][] = new char[r][4];
 
        
       /* for (int i=0; i<arr.length; i++){
            arr[i] = new char[4];
        }*/
        int count = 0;
        for (int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = y[count++];
 
        System.out.println("Contents of 2D Jagged Array");
        for (char i=0; i<arr.length; i++)
        {
            for (char j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

}
