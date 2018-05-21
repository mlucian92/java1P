/**
 * 
 * map()
 * 
 */


package java1PCurs3;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Exemplu6 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("AAA", "BBBB", "CCCCC", "DD");
		
		/*int sum = 
		list.stream()
			.map(s -> s.length())
			.reduce(0, (a,b) -> a+b);
		
		System.out.println((double)sum / list.size());
		*/
		
		double av = 
				list.stream()
					.mapToInt(s -> s.length())
					.average()
					.getAsDouble();
		System.out.println(av);
	}
}
