package java1PCurs1;

import java.io.*;
import java.util.Random;

public class Java1PCurs1Ex6 {
	public static void main(String[] args) {
		Random random = new Random();

		try (
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				PrintStream ps1 = new PrintStream("D:/numere.txt");
								
			){
			int x = Integer.parseInt(br1.readLine());
			for(int i = 0; i < x; i++) {
				ps1.println(random.nextInt(1000));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
