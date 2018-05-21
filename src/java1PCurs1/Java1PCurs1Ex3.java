package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex3 {
	public static void main(String[] args) {
		
		try(PrintStream out = new PrintStream("C:/Users/Lucian Mircioaga/Desktop/test 1")){
			out.println("Hello Hello");	
			
		} catch(FileNotFoundException e) {
			System.out.println(":)");
		}
		
	}
}
