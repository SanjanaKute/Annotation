package core.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
	int testcase();
}
public class MainClass1 
{
	
	@Test(testcase = 1)
	public static void main(String []args)
	{
		
	}
}
