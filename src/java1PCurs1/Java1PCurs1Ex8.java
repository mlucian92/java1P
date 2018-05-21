package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex8 {
	public static void main(String[] args) {
		
		try (
				FileOutputStream fos = new FileOutputStream("D:/punct1");
				ObjectOutputStream out = new ObjectOutputStream(fos);
		){
					
			out.writeObject(new Punct(10,20));
			
		}catch(Exception e) {
			System.out.println(":)");
		}
		
	}
}
