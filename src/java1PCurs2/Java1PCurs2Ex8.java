package java1PCurs2;

import java.nio.file.*;

public class Java1PCurs2Ex8 {
	public static void main(String [] args) {
		
		Path p1 = Paths.get("C:/ABC/SD/SDASD");
		Path p2 = Paths.get("ABC/SD");
		
		System.out.println(p1.isAbsolute());
		System.out.println(p2.isAbsolute());
		
	}
}
