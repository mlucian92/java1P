package java1PCurs2;

import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java1PCurs2Ex12 {
	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:/AAA/BBB/CCC/DDD");
		Path p2 = Paths.get("AAA/QQQ/EEE");
		
		Path p3 = p1.relativize(p2);
		
		System.out.println(p3);
	}
}
