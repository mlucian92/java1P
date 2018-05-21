package java1PCurs1;

import java.io.*;

public class Java1PCurs1Ex5 {
	public static void main(String[] args) {

		try {

			BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));

			String cmd;
			while (true) {
				System.out.print("Comanda: ");
				cmd = cons.readLine();
				String[] v = cmd.split("\\s+");

				switch (v[0]) {
				case "exit":
					return;
				case "copy":

					BufferedReader in = new BufferedReader(new FileReader(v[1]));

					PrintStream out = new PrintStream(v[2]);
					try {
						String line;
						while ( (line = in.readLine()) != null) {
							out.println(line);
						}
					} finally {
						in.close();
						out.close();
					}
					System.out.println("Fisierul a fost copiat");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(":)");
		}

	}
}
