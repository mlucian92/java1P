package java1PCurs3;

import java.time.*;

public class Exemplu13 {
	public static void main(String[] args) {
		
		LocalDateTime lt1 = LocalDateTime.now();
		LocalDateTime lt2 = LocalDateTime.of(2018, Month.MAY, 28, 10, 22, 55);
		
		System.out.println(lt1);
		System.out.println(lt2);
		
		LocalDateTime lt3 = lt1.minusMinutes(23);
		LocalDateTime lt4 = lt3.plusHours(2);
		
	}
}
