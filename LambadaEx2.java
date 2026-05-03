package basics;

public class LambadaEx2 
{

	public static void main(String[] args) 
	{
        Runnable Myrunnable = () -> System.out.println(" My thread is running");
        new Thread(Myrunnable).start();
    }

}
