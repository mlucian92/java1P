package java1PCurs1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Java1PCurs1Ex10 {
	public static void main(String[] args) {
		
		try(
			
			FileOutputStream fos = new FileOutputStream("D:/produse");
			ObjectOutputStream out = new ObjectOutputStream(fos);
				
		){
			List<Produs> produse = new ArrayList<>();
			produse.add(new Produs("A", 5));
			produse.add(new Produs("B", 15));
			produse.add(new Produs("C", 10));
			produse.add(new Produs("D", 6));
			produse.add(new Produs("E", 7));
			produse.add(new Produs("F", 8));
			out.writeObject(produse);
			
		} catch (Exception e) {
			System.out.println(":)");
		}
		
	}
}
