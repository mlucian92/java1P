package java1PCurs1;

import java.io.*;

public class Java1pCurs1Ex15 {
	public static void main(String[] args) {

		File file1 = new File("D:/file1");

		try {
			file1.createNewFile();
			System.out.println("IS FILE " + file1.isFile());
		} catch (IOException e) {
			System.out.println(":)");
		}
	}
}
