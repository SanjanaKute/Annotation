package core.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.text.Annotation;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute
{
	int sequence() default 0;
}
public class MainClass3 {
	@Execute(sequence=2)
	public void myMethod1(){
		System.out.println("From method1");
	}
	@Execute(sequence=1)
		public void myMethod2(){
		System.out.println("From method2");
	}
	@Execute(sequence=3)
	public void myMethod3(){
	System.out.println("From method3");
}
	public static void main(String[] args) throws Exception
	{
		MainClass3 myclass=new MainClass3();
		myclass.myMethod1();
		myclass.myMethod3();
		myclass.myMethod2();
        Class c=myclass.getClass();
        Method m=c.getDeclaredMethod("myMethod1");
        Method m1=c.getDeclaredMethod("myMethod2");
        Method m2=c.getDeclaredMethod("myMethod3");
        Execute a= m.getAnnotation(Execute.class);        //        Annotation a= m.getAnnotation(Execute.class);
        Execute a1=m1.getAnnotation(Execute.class);
        Execute a2= m2.getAnnotation(Execute.class);
       // Execute e=(Execute)a; 
      //  Execute e1=(Execute)a1;
      //  Execute e2=(Execute)a2;
        
        System.out.println(a.sequence());
        System.out.println(a1.sequence());
        System.out.println(a2.sequence());


        
   }

}
