package java1PCurs2;

import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java1PCurs2Ex16 {
	public static void main(String[] args) {
		
		try {
		Path p1 = Paths.get("Java1PCurs2Ex1.class");
		Path p2 = Paths.get("test_copy.txt");
		Path p3 = Paths.get("AAA");
		Path p4 = Paths.get("BBB/CCC/DDD");
		
		Files.createDirectory(p3);
		Files.createDirectories(p4);
		
		//Files.copy(p1,  p2);
		System.out.println(Files.isSameFile(p1,  p2));
		
		//System.out.println(p2);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
