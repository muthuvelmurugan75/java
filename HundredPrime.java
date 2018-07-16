package javaprogram;

 public class HundredPrime {
    public static void main(String[] args) {
                     int[] primeNum = new int[100];
        primeNum[0] = 2;   
        int i,c = 1,z=3;
                // Calcuating 100 Prime Numbers

     
        while(c<100)
        {
            for(i=0;i<c;i++)
            {
            	System.out.println(i);
                if( z % primeNum[i] == 0)
                     break;
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------");

            if(i == c)
            {
                primeNum[c] = z;
                c++;
            }
            z++;
        }
        
        // Printing the first 100 Prime Numbers
        for(i=0;i<100;i++)
            System.out.print(primeNum[i] + " ");
        
    }
    
}
