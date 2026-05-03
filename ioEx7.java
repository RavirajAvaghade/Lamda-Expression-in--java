package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ioEx7 
{

	public static void main(String[] args) throws IOException 
	{
      PrintWriter pw = new PrintWriter("C:\\toxic\\raj.txt");
      File f = new File("C:\\ravi");
      String [] a = f.list();
      for(String s: a)
      {
    	     BufferedReader br = new BufferedReader(new FileReader("C:\\ravi\\"+s));
    	     String line =br.readLine();
    	     while(line!=null)
    	     {
    	    	    pw.println(line);
    	    	    line =br.readLine();
    	     }
    	     
      }
      pw.flush();
      pw.close();
	}

}
