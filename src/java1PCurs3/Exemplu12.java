package java1PCurs3;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Exemplu12 {
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(2018, Month.MAY, 05);
		System.out.println(d1);
		System.out.println(d2);
		
	}
}
