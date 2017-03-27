package com.work.www;

import java.io.File;
import java.io.IOException;
 

public class File_hidden_in_java {

	
		
		
		 
		    public static void main(String[] args) throws IOException, SecurityException
		    {	
		    	// Provide the complete file path here
		    	File file = new File("C:/Users/Muthuvel/Desktop/d/workout/src/com/work/www/copy");
		 
		    	if(file.isHidden()){
		    		System.out.println("The specified file is hidden");
		    	}else{
		    		System.out.println("The specified file is not hidden");
		    	}
		    }
		}
		
		
	


