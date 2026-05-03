package basics;

import java.util.Arrays;

public class LambdaEx9 
{

	public static void main(String[] args) 
	{
      String[] words = {"Apple","Banana","Chery"};
      Arrays.sort(words, (a,b)->a.length()-b.length());
      for(String word:words)
      {
    	     System.out.println(word);
      }
	}

}
