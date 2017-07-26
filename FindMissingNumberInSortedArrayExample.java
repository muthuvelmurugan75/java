
package com.Contacts.www;

public class FindMissingNumberInSortedArrayExample{
    static int ar[]={3,5,8,10}; 
    
    public static void main(String[] args) {
           displayMissing();       
    }
    
    
    static public void displayMissing(){
           
           System.out.print("given array(already sorted): ");
           for (int j = 0; j < ar.length; j++){
                  System.out.print(ar[j] +" ");
           }
           System.out.print("\nNumbers missing between 1 to 100 in array :  ");
           
           int j=0;
           for(int i=1;i<=12;i++){
                  if(j<ar.length && i==ar[j])
                        j++;
                  else
                        System.out.print(i+" ");
                  
           }
           
    }
    
}