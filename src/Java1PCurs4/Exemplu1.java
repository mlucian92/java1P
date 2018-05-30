package java1PCurs4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Exemplu1 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("aaa", "bb", "c", "ddddd");
		
		String rez =  
			list.stream()
				.map(s -> String.valueOf(s.length()))
				.collect(Collectors.joining(","));
		
		System.out.println(rez);
	}
}
