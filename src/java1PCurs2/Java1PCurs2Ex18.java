package java1PCurs2;

import java.util.stream.*;

public class Java1PCurs2Ex18 {
	public static void main(String[] args) {
		Stream.iterate(1, i -> i+1)
			.limit(10)
			.forEach(System.out::println);
		
	}
}
