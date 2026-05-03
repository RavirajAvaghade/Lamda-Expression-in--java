package basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class employee
{
	public String name;
	public int id;
	public String getname()
	{
		return name;
	}
	public void getid()
	{
		this.id = id;
	}
}
public class jvmex2 
{

	public static void main(String[] args) 
	{
       employee e = new employee();
       Class a = e.getClass();
       System.out.println(e.getname());
       Method [] m = a.getDeclaredMethods();
       for(int i =0; i<m.length; i++)
       {
    	     System.out.println(m[i]);
       }
       Field [] f = a.getDeclaredFields();
       for(int i=0; i<f.length; i++)
       {
    	      System.out.println(f[i]);
       }
       
       
	}

}
