package basics;
import java.util.Arrays;
import java.util.Comparator;

public class Comparator1 
{
    public static void main(String[] args) 
    {
        String[] words = {"apple", "banana", "cherry"};

        Arrays.sort(words, new Comparator<String>() 
        {
            @Override
            public int compare(String a, String b) 
	    {
                return a.length() - b.length();
            }
        });

        for (String word : words) {
            System.out.println(word);
        }
    }
}