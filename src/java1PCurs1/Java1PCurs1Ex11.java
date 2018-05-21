package java1PCurs1;

import java.io.*;
import java.util.*;

public class Java1PCurs1Ex11 {
	public static void main(String[] args) {
		
		try(
			
			FileInputStream fis = new FileInputStream("D:/produse");
			ObjectInputStream in = new ObjectInputStream(fis);	
				
		){
			List<Produs> produse = (List<Produs>) in.readObject();
			produse.forEach(p -> System.out.println(p.nume + " " + p.pret));
						
		} catch (Exception e) {
			System.out.println(":)");
		}
		
	}
}
