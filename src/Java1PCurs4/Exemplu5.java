package Java1PCurs4;

import java.util.*;
import java.util.stream.*;

public class Exemplu5 {
	public static void main(String[] args) {
		
		List<List<String>> list = new ArrayList<>();
		list.add(Arrays.asList("aaa", "bbbb", "cccccc", "d"));
		list.add(Arrays.asList("kksadk", "vvsadvv", "bbbb", "nn"));
		list.add(Arrays.asList("wwww", "bbbsadasdb", "cccsadsaccc", "dsad"));
		
		
		List<Integer> values = 
			list.stream()
				.flatMap(k -> k.stream())
				.map(s -> s.length())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(values);
	}
}
