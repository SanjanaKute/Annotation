package core.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info
{
	int AuthorId();
	String AuthorName();
	String supervisor() default "Onkar";	
	String Date();
	String Time();
	int Version();
}
public class MainCLass2 {

	public static void main(String[] args)
	{

		Information i=new Information("Information");
		Class c=i.getClass();
		java.lang.annotation.Annotation a= c.getAnnotation(Info.class); 
		Info in=(Info)a;
		System.out.println(in.Date());
		System.out.println(in.AuthorId());
		System.out.println(in.Time());
		System.out.println(in.Version());
	}

	private static Object Date() {
		// TODO Auto-generated method stub
		return null;
	}

}
@Info(AuthorId=1,AuthorName="Sanjana",Date="08.01.2000",Time="7.00",Version=3)
class Information{
	String Information;
	public Information(String Information)
	{
		super();
		this.Information=Information;
	}
}