package basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ioEx1 
{
   public static void main(String[]args) throws IOException
   {
	   File f = new File("C:\\ravi\\Ravi");
	   f.createNewFile();
	   
   }
}
