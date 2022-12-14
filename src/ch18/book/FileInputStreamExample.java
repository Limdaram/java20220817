package ch18.book;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"src/ch18/book/FileInputStreamExample.java");
		
			int data;
			while ((data = fis.read()) != -1) {
				System.out.write(data); // System.out.println(); 아니고 System.out.write();
			}
			fis.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
