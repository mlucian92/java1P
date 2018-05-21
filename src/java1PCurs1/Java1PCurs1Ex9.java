package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex9 {
	public static void main(String[] args) {
		
		try(
			
			FileInputStream fis = new FileInputStream("D:/punct1");
			ObjectInputStream in = new ObjectInputStream(fis);
				
		) {
			Punct p = (Punct) in.readObject();
			System.out.println(p.x + " " + p.y);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
