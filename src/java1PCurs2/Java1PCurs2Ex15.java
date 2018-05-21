package java1PCurs2;

import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java1PCurs2Ex15 {
	public static void main(String[] args) {
		
		try{
			
			Path p1 = Paths.get("AAA");
			Path p2 = Paths.get("AAA");
					
			boolean isSame = Files.isSameFile(p1, p2);
			
			System.out.println(isSame);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
