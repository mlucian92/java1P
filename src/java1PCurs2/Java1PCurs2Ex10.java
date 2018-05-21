package java1PCurs2;

import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java1PCurs2Ex10 {
	public static void main(String[] args) {
		
		Path p1 = Paths.get("AAA/BBB");
		Path p2 = Paths.get("CCC/DDD");
		
		Path p3 = p2.resolve(p1);
		
		System.out.println(p3);
		
	}
}
