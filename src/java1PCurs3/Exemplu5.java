package java1PCurs3;

import java.util.*;
import java.util.stream.*;

public class Exemplu5 {
	public static void main(String[] args) {
		Random random = new Random();
		
		Stream.generate(() -> random.nextInt(1000) + 1)
			  .limit(15)
			  .forEach(System.out::println);
		
	}
}
