package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex13 {
	public static void main(String[] args) {
		
		try(
				
			FileInputStream fis = new FileInputStream("D:/c");
			ObjectInputStream in = new ObjectInputStream(fis);
				
		){ 
			C c1 = (C) in.readObject();
						
		}catch(Exception e) {
			System.out.println(":)");
		}
		
	}
}
