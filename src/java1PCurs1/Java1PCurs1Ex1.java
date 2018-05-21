package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex1 {
	public static void main(String[] args) {
		
		BufferedReader cons = new BufferedReader(
				
				new InputStreamReader(System.in)
				);

		try {
			System.out.println("Introdu un String!");
			String line = cons.readLine();
			StringBuilder sb = new StringBuilder(line);
			sb.reverse();
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
