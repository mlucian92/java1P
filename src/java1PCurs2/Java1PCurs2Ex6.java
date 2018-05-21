package java1PCurs2;

import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java1PCurs2Ex6 {
	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:/ABC/ABD/AED");
		
		System.out.println("ROOT "+ p1.getRoot());
		System.out.println("PARENT " + p1.getParent());
		System.out.println("FILE NAME " + p1.getFileName());
	}
}
