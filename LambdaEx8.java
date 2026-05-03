package basics;
class Mythread1 implements Runnable
{
	public void run()
	{
		System.out.println(" Hii Good Morning !!");
		System.out.println(" hello");
	}
}
public class LambdaEx8 
{

	public static void main(String[] args) 
	{
       Mythread1 m = new Mythread1();
       Thread t = new Thread(m);
       t.start();
	}

}
