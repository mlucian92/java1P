package java1PCurs2;

import java.util.*;

public class Java1PCurs2Ex20 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "AA", "BCD", "QW", "KKKK");
		
		list.stream()
			.map(s -> s.length())
			.filter(e -> e % 2 == 0)
			.forEach(System.out::println);;
			
		double rez = list.stream()
			.map(s -> s.length())
			.filter(e -> e % 2 == 0)
			.reduce(1, (i, j) -> i*j);
		System.out.println(rez);
	}
}
