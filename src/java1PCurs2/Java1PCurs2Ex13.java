package java1PCurs2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Java1PCurs2Ex13 {
	public static void main(String[] args) {
		
		Path p1 = Paths.get(".project");
		boolean exists = Files.exists(p1);
		
		System.out.println(exists);
		
		boolean isFile = Files.isRegularFile(p1);
		
		System.out.println(isFile);
		
	}
}
