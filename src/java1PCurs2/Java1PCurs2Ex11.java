package java1PCurs2;

import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java1PCurs2Ex11 {
	public static void main(String[] args) {
		
		Path p1 = Paths.get("AAA/BBB/./././.././EEE");
		Path p2 = Paths.get("C:/CCC/DDD");
		
		System.out.println(p2.resolve(p1));
		
		System.out.println(p1.resolve(p2).equals(p2.resolve(p1)));
		
		
	}
}
