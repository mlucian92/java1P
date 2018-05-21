package java1PCurs2;

import java.io.*;

public class Java1PCurs2Ex1 {
	public static void main(String[] args) {
		
		try {
			
			File file = new File("TEST1");
			file.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
