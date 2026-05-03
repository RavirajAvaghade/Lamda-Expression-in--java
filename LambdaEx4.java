package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEx4 
{

	public static void main(String[] args) 
	{
       ArrayList<Integer> list = new ArrayList<>(List.of(20,10,30,50));
       Collections.sort(list,(o1,o2) -> o2-o1);
       System.out.println(list);
	}

}
