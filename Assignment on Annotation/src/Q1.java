import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface Test{
	
}

public class Q1 {
	
	@Test
	public void test() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//@Test
//class Demo{
//	
//}
