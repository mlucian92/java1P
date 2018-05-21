package java1PCurs3;

import java.util.*;

public class Exemplu9 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 3, 5, 6, 6, 6, 5, 3, 1, 1, 8, 3, 2);		
		
		int sum = list.stream()
			.distinct()
			.mapToInt(x -> x)
			.sum();
		System.out.println(sum);
	}
}
