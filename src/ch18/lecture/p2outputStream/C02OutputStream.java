package ch18.lecture.p2outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

public class C02OutputStream {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("src/ch18/lecture/p2outputStream/C02OutputStream.java");
		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\output\\output2.txt");
		
		int read = 0;
		
		while ((read = is.read()) != -1) {
			os.write(read);
		}
		
		is.close();
		os.close();
	}
}
