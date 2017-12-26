package com.tricky.www;


public class Zoho_program5 {
	public static void main(String [] args){
			 String [] names ={"9r","6t","8u"};
			    for ( String sr:names){
			    	char c=0;
			    	int a1=0;
			    	String y="";
			    	char cf=0; 
			    	for(int sr1=0;sr1<sr.length();sr1++){
			    		char hc=sr.charAt(sr1);
			    		for( cf='a';cf<='z';cf++){
			    			if(hc==cf){
			    				c=hc;
			    				}
			    			}
			    		for(int k=0;k<99;k++){
			    			if(hc==k){
			    				y+=hc;
			    				a1=Integer.parseInt(y);
			    				}
			    			}
			    		display(a1,c);	
			    		}
			    	}
			    }
	public static void display(int a,char c){
		String st="";
		for(int i=1;i<=a;i++){
			st+=c;
			}
		String tr=st.trim();
		for(int i=0;i<tr.length();i++){
			char c4=st.charAt(i);
			System.out.print(c4);
			}
		}
	}

