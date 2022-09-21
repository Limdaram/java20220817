package ch18.book;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("src/ch18/book/FileReaderExample.java");
		
		int readCharNo;
		char[] buf = new char[100];
		
		while ((readCharNo = fr.read(buf)) != -1) {
			String data = new String(buf, 0, readCharNo);
			System.out.print(data);
		}
		
		fr.close();
	}
}
