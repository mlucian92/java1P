package java1PCurs2;

import java.io.*;

public class Java1PCurs2Ex3 {
	public static void main(String[] args) {
		
		File file = new File("C:/");
		String [] fileNames = file.list();
		
		for(int i = 0; i < fileNames.length; i++) {
			System.out.println(fileNames[i]);
		}
		
	}
}
