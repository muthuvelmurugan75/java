package com.work.www;
import java.io.*;

public class Copy_file_one_to_another {

	public static void main(String[] args) throws IOException {
		 
		 
		        File fileName = new File("/workout/src/com/work/www/gmail.txt"); 
		         
		        FileInputStream inFile = new FileInputStream("copy.txt");
		        int fileLength =(int)fileName.length();
		             
		        byte Bytes[]=new byte[fileLength];
		             
		        System.out.println("File size is: " + inFile.read(Bytes));
		             
		        String file1 = new String(Bytes);
		        System.out.println("File content is:\n" + file1);
		     
		        FileOutputStream outFile = new FileOutputStream("C:/Users/Muthuvel/Desktop/d/workout/src/com/work/www/copy-copy.txt");
		     
		        for (int i = 0; i<fileLength; i++)
		        {
		            outFile.write(Bytes[i]);
		        }       
		             
		        System.out.println("File copied.");
		        //close files
		        inFile.close();
		        outFile.close();
		    
		
		
}

}

