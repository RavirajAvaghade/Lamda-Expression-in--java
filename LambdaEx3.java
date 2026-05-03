package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEx3 
{

	public static void main(String[] args) 
	{
       ArrayList<Integer> list = new ArrayList<Integer>(List.of(10,25,13,15));
       Collections.sort(list,(o1,o2) -> o2-o1);
       System.out.println(list);
	}

}
