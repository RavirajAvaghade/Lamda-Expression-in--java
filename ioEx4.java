package basics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ioEx4 
{

	public static void main(String[] args) throws IOException 
	{
      FileWriter fw = new FileWriter("C:\\ravi\\Ravi");
      PrintWriter out = new PrintWriter(fw);
      out.write(100);
      out.println(100);
      out.println(true);
      out.println('c');
      out.println('r');
      out.println("sai charan");
      out.flush();
      out.close();
	}

}
