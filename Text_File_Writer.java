package tricky;

import java.io.FileWriter;
import java.io.IOException;

public class Text_File_Writer {
	 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:file1.txt",true);//if we give false old letters are deleted freshly write 
            writer.write("jos");
            writer.write("\r\n");   // write new line
            writer.write("9789");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}