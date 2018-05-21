package java1PCurs3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Exemplu7 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("AAAA", "BBBB", "CCCCC", "DD");
		
		boolean b1 = list.stream()
						 .map(s -> s.length())
						 .allMatch(n -> n % 2 == 0);
		
		System.out.println(b1);
		
		long c1 = list.stream()
					 .filter(x -> x.length() % 2 == 0)
					 .count();
		
		System.out.println(c1);
	}
}
