package com.Contacts.www;

public class BinaryToDecimalConversionExample {
    
    public static void main(String...args){       
              int decimal=1110;
        System.out.println("binary "+decimal+" = decimal " + binaryToDecimalConverter(decimal));
              decimal=1111;
              System.out.println("binary "+decimal+" = decimal " + binaryToDecimalConverter(decimal));
   }
     
    /*
     * method converts binary number to decimal.
     */
    public static int binaryToDecimalConverter(int binary){      
        int decimal = 0;
        int power = 0;
        while(binary>0){
         decimal += (binary%10) * Math.pow(2, power++);
         binary = binary/10;
        }
        return decimal;
    }
    
}

