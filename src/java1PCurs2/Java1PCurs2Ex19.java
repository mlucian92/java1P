package java1PCurs2;

import java.util.stream.*;
import java.util.*;

public class Java1PCurs2Ex19 {
	public static void main(String [] args) {
		
		Stream.generate(() -> new Random().nextInt(1000))
		.limit(10)
		.forEach(e -> System.out.println(e));
		
	}
}
