package collection.com;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1  {

	public static void main(String[] args) throws Exception {
		
		Class c =Class.forName("Student");
		Method []m=c.getDeclaredMethods();
		for(Method m1:m)
		{
			System.out.println(m1);
		}
		Field []f=c.getDeclaredFields();
		for(Field f1:f)
		{
			System.out.println(f1);
		}
	}
	
}
