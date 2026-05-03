package basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ioex5 
{

	public static void main(String[] args) throws IOException 
	{
       BufferedReader br = new BufferedReader(new FileReader("C:\\ravi\\file01.txt"));
		PrintWriter pr = new PrintWriter("C:\\ravi\\file03.txt");
       String line = br.readLine();
       while(line!=null)
       {
    	      pr.println(line);
    	      line = br.readLine();
       }
       br = new BufferedReader(new FileReader("C:\\ravi\\file02.txt"));
       line = br.readLine();
       while(line!=null)
       {
    	      pr.println(line);
    	      line = br.readLine();
       }
       pr.flush();
       pr.close();
       br.close();
	}

}
