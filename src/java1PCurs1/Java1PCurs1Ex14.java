package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex14 {
	public static void main(String [] args) {
		
		File file1 = new File("D:/folder1");
		
		file1.mkdir();
		
		boolean b1 = file1.exists();
		
		if(b1) {
			System.out.println("File exists");
		} else {
			System.out.println("File doesn't exist");
		}
	}
}
