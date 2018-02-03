package tricky;

import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
	 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("D:file1.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
            	if(character=='m'){
            		//System.out.println("muthu");
            	}
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}