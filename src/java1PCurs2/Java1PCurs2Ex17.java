package java1PCurs2;

import java.util.*;

public class Java1PCurs2Ex17 {
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,3,5,6,7);
		
		list.stream()
		.limit(2)
		.filter(e -> e % 2 != 0)
		.forEach(System.out::println);;
		
	}
}
