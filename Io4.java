package basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Io4 
{

	public static void main(String[] args) throws IOException 
	{
      FileReader fr = new FileReader("C:\\ravi\\Ravi");
      BufferedReader br = new BufferedReader(fr);
      String line = br.readLine();
      while(line!=null)
      {
    	    System.out.println(line);
    	    line = br.readLine();
      }
	}

}
