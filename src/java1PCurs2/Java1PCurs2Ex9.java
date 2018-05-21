package java1PCurs2;

import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java1PCurs2Ex9 {
	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:/AAA/BBB/CCC/DDD");
		Path s1 = p1.subpath(0, 2);
		
		System.out.println(s1);
	}
}
