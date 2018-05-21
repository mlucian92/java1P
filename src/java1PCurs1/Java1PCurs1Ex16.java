package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex16 {
	public static void main(String [] args) {
		
		File file1 = new File("D:/file1");
		boolean b = file1.delete();
		System.out.println("A fost sters "+b);
		
	}
	
	
}
