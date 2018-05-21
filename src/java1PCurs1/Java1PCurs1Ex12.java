package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex12 {
	public static void main(String[] args) {
		try(
			FileOutputStream fos = new FileOutputStream("D:/c");
			ObjectOutputStream out = new ObjectOutputStream(fos);
				
		){
			C c1 = new C();
			out.writeObject(c1);
			
		} catch(Exception e) {
			System.out.println(":)");
		}
	}
}
