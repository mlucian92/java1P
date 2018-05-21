package java1PCurs3;

import java.util.stream.*;
import java.util.*;

public class Exemplu8 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ABC", "JDSHSAS", "SAHGDW", "DEJHRBAKSOQ");
		
		long nr = list.stream()
					  .map(s -> Arrays.asList(s.split("\\s*")))
					  .flatMap(q -> q.stream())
					  .filter(c -> "aeiou".contains(c.toLowerCase()))
					  .count();
		System.out.println(nr);
	}
}
