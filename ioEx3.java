package basics;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ioEx3 
{

	public static void main(String[] args) throws IOException 
	{
         FileReader fw = new FileReader("C:\\ravi\\Ravi");
         /*int i = fw.read();
         while(i!=0)
         {
        	   System.out.println((char)i);
        	   i = fw.read();
         }*/
		char [] ch = new char[(int)new File("C:\\ravi\\Ravi").length()];
        fw.read(ch);
        for(char c: ch)
        {
        	 System.out.print(c);
        }
	}

}
