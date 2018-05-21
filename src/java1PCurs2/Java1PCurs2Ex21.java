package java1PCurs2;

import java.nio.file.*;
import java.io.*;

public class Java1PCurs2Ex21 {
	public static void main(String[ ] args) {
		
		try {
			
		Path p1 = Paths.get("./");
		Files.walk(p1).forEach(System.out::println);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
