package java1PCurs3;
import java.util.*;
public class Exemplu18 {
	public static void main(String [] args) {
		
		Locale loc1 = new Locale("en");
		Locale loc2 = new Locale("en", "US");
		Locale loc3 = new Locale.Builder()
								.setLanguage("en")
								.setRegion("US")
								.build();
		
		Locale loc4 = Locale.GERMANY;
		
		System.out.println(loc1);
		System.out.println(loc2);
		System.out.println(loc3);
		System.out.println(loc4);
		
	}
}
