package java1PCurs1;

import java.io.*;

public class Java1PCurs1Exersare {
	public static void main(String[] args) {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String line = console.readLine();
			
			StringBuilder sb = new StringBuilder(line);
			sb.reverse();
			
			System.out.println(sb);
		} catch(Exception e) {
			System.out.println(":)");
		}
	}
}
