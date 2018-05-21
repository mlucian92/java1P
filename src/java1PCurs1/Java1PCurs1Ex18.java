package java1PCurs1;

import java.io.*;
import java.util.Arrays;

public class Java1PCurs1Ex18 {
	public static void main(String[] args) {
		
		try {
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			
			String cmd;
			
			while(true) {
				System.out.println("CMD: ");
				cmd = console.readLine();
				String [] v = cmd.split("\\s+");
				
				switch(v[0]) {
				case "exit":
					return;
				case "mkdir":
					new File(v[1]).mkdir();
					System.out.println("Folderul a fost creat");
					break;
				case "cf":
					new File(v[1]).createNewFile();
					System.out.println("Fisierul a fost creat");
					break;
				case "remove":
					File f1 = new File(v[1]);
					boolean b = f1.delete();
					if(b) {
						System.out.println("Fisierul a fost sters");
					} else {
						System.out.println("Fisierul nu a fost sters");
					} 
					break;
				case "list":
					String [] files = new File(v[1]).list();
					Arrays.asList(files).forEach(System.out::println);
					break;
				
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
