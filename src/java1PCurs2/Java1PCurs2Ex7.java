package java1PCurs2;

import java.nio.file.*;

public class Java1PCurs2Ex7 {
	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:/ABC/QWER/SDKJ");
		
		for(int i=0; i<p1.getNameCount(); i++) {
			System.out.println(p1.getName(i));
		}
	}
}
