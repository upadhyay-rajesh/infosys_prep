import java.util.Arrays;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(3,6,8,2,4);
		
		for(Integer n:a) {
			System.out.println(n);
		}
		
		a.forEach(abc->System.out.println(abc));

	}

}
