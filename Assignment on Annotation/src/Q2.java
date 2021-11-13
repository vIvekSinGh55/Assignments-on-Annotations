import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@interface info
{
	int authorID();
	String author() default "Null" ;
	String supervisor() default "Null";
	String date();
	String time();
	double version();
	String description() default "Null";
}

@info(authorID=01,date="15-05-2010",time="15.35",version=7.4)
public class Q2 {
	
	@info(authorID=01,date="15-05-2010",time="15.35",version=7.4)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


