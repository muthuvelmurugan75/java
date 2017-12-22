package com.tricky.www;


public class Zoho_3_4_onlyProgram_12_22_17
{
	public static void main(String[] args) 
	{
		for(int i=1;i<100;i++){
		Cal(i);
		}
        }
	
	public static void Cal(int n){
		String d="";
		int a;
        String x = "";
        
        while(n > 0)
        {
            a = n % 2;
            x =  a+x;
            n = n / 2;
        }
	      char [] temp=x.toCharArray();
	      int len=temp.length;
	      String ne = "";
	      for(int i=1;i<len;i++)
	      {
	          if(temp[i]=='0')
	              temp[i]='3';
	          ne=ne+temp[i];
	          if(temp[i]=='1')
	              temp[i]='4';
	          d=d+temp[i];

	      }
	      
	        System.out.println("Binary number:"+d);

	}
		
		
		}
		
