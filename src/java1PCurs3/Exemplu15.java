package java1PCurs3;
import java.time.*;
public class Exemplu15 {
	public static void main(String[] args) {
		
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime zd2 = ZonedDateTime.now(ZoneId.of("Europe/Bucharest"));
		
		System.out.println(z1);
		System.out.println(zd2);
		
		ZonedDateTime zd3 = z1.plusHours(17);
		System.out.println(zd3);
	}
}
