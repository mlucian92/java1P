package java1PCurs1;

import java.io.*;
import java.util.*;import org.omg.Messaging.SyncScopeHelper;

public class Java1PCurs1Ex17 {
	public static void main(String [] args) {
		
		File file = new File("C:/");
		String [] files = file.list();
		File[] v = file.listFiles();
		Arrays.asList(files).forEach(System.out::println);
		
	}
}
