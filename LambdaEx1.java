package basics;

public class LambdaEx1 
{

	public static void main(String[] args) 
	{
       int x =12;
       int y =13;
       Calculator ob = (int a, int b)->
       {
    	      System.out.println(" sum is : "+(a+b));
       };
       ob.sum(x, y);
	}


}
interface Calculator
{
	void sum(int a,int b);
}