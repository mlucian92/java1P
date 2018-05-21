package java1PCurs3;
import java.util.*;
public class Exemplu19 {
	public static void main(String[] args) {
		
		Locale loc = new Locale("ro", "RO");
		
		ResourceBundle bundle = ResourceBundle.getBundle("exemplu", loc);
		String hello = bundle.getString("txtHello");
		
		System.out.println(hello);
		
	}
}
