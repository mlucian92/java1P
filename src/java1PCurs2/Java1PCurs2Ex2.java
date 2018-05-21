package java1PCurs2;

import java.io.*;

public class Java1PCurs2Ex2 {
	public static void main(String[] args) {
		
		try {
			File file = new File("D:/TESTNOU");
			file.mkdir();
		
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}
}
