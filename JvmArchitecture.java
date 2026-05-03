package basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class student
{
	public String name;
	public int id;
	public String getname()
	{
		return name;
	}
	public void setid()
	{
		this.id = id;
	}
}
public class JvmArchitecture 
{

	public static void main(String[] args) 
	{
      student s = new student();
      Class c = s.getClass();
      System.out.println(c.getName());
      Method [] m =c.getDeclaredMethods();
      for(int i=0; i<m.length; i++)
      {
    	      System.out.println(m[i]);
      }
      Field [] f = c.getDeclaredFields();
      for(int i=0; i<f.length; i++)
      {
    	    System.out.println(f[i]);
      }
      
	}

}
