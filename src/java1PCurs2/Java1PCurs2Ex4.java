package java1PCurs2;

import java.io.*;
import java.util.*;

public class Java1PCurs2Ex4 {
	public static void main(String[] args) {
		
		try(
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
				
				
		){
			String cmd;
			
			while(true) {
				System.out.println("Introdu o comanda: ");
				cmd = br.readLine();
				String v[] = cmd.split("\\s");
				
				switch(v[0]) {
				case "exit" :
					return;
				case "cf": {
					File file = new File(v[1]);
					file.createNewFile();
					System.out.println("A fost creat fisierul cu calea " + v[1]);
				}
					break;
				case "md": {
					File file = new File(v[1]);
					file.mkdir();
					System.out.println("A fost creat folderul cu calea " + v[1]);
				} 
					break;
				case "del": {
					File file = new File(v[1]);
					file.delete();
					System.out.println("A fost sters fisierul cu calea " + v[1]);
				}
					break;
				case "list": {
					File file = new File(v[1]);
					Arrays.asList(file.list()).forEach(System.out::println);
				} 
					break;
				}
			}
			
		} catch(Exception e) {
			e.getStackTrace();
		}
		
	}
}
