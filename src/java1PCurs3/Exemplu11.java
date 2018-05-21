package java1PCurs3;

import java.time.*;

public class Exemplu11 {
	public static void main(String[] args) {
		
		LocalTime t1 = LocalTime.now();
		LocalTime t2 = LocalTime.of(10, 55);
		LocalTime t3 = LocalTime.of(10, 30, 45);
		LocalTime t4 = LocalTime.of(10, 55, 30, 45);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		LocalTime rez1 = t1.minusMinutes(10);
		System.out.println(rez1);
		LocalTime rez2 = t1.plusMinutes(30);
		System.out.println(rez2);
		
		if(rez1.isAfter(rez2)) {
			System.out.println("rez1 " + rez1 + " is after rez2  "+ rez2 );
		} else {
			System.out.println("rez2 " + rez2 + " is after rez1 " + rez1);
		}
	}
}
