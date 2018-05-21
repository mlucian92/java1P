package java1PCurs3;

import java.time.*;

public class Exemplu14 {
	public static void main(String[] args) {
		
		ZoneId.getAvailableZoneIds()
			  .stream()
			  .filter(z -> z.contains("Europe"))
			  .forEach(System.out::println);
		
	}
}
