package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex4 {
	public static void main(String[] args) {

		try {
			
			FileInputStream fis = new FileInputStream("C:/Users/Lucian Mircioaga/Desktop/test 1");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			
			String line;
			while( (line = in.readLine()) != null) {
				System.out.println("line");
			}
		} catch (Exception e) {
			System.out.println(":)");
		}
	}
}
