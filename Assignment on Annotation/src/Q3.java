import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int sequence() default 5;
	
}


public class Q3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
