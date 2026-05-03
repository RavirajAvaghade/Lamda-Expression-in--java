package basics;

public class LambdaEx5 
{

	public static void main(String[] args) 
	{
		Calculator1 c = (a,b) -> System.out.println(" sum is : "+(a+b));
		c.add(20,20);
	}

}
interface Calculator1
{
	void add(int a,int b);
}
class calci implements Calculator1
{
	public void add(int a, int b) 
	{
		System.out.println(" sum is : "+(a+b));
	}
	
}