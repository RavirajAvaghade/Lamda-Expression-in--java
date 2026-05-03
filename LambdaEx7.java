package basics;

class Mythread implements Runnable
{
	public void run() 
	{
		System.out.println(" Thread is running ");
	}
	
}
public class LambdaEx7 
{

	public static void main(String[] args) 
	{
         Mythread m = new Mythread();
         Thread t = new Thread(m);
         t.start();
	}

}
