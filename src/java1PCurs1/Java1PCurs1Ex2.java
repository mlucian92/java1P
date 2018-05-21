package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex2 {
	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(isr);

		try {
			System.out.println("Introdu primul numar: ");
			Double number1 = Double.parseDouble(console.readLine());
			System.out.println("Introdu al doilea numar: ");
			Double number2 = Double.parseDouble(console.readLine());
			System.out.println("Suma numerelor introduse de la tastatura este de " + (number1 + number2));
		} catch (Exception e) {
			System.out.println("Eroare");
		} finally {
			try {
				if (console != null) {
					console.close();
				}
			} catch (Exception e) {
				System.out.println("Eroare");
			}
		}

	}
}
