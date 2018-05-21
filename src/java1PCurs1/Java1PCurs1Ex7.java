package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex7 {
	public static void main(String[] args) {
		
		try(
			FileInputStream fs = new FileInputStream("D:/numere.txt");
			BufferedReader br2 = new BufferedReader(new InputStreamReader(fs));
			PrintStream ps = new PrintStream("D:/double.txt");
				
		){
			String line;
			while( (line = br2.readLine()) != null) {
				int d = Integer.parseInt(line);
				ps.println(d*2);
				
			}
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
