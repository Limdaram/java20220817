package ch18.lecture.p2outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C04OutputStream {
	public static void main(String[] args) throws Exception {
		String inFile = "src/ch18/lecture/p2outputStream/C04OutputStream.java";
		String outFile = "C:\\Users\\user\\Desktop\\output\\output4.txt";
		
		InputStream fis = new FileInputStream(inFile);
		OutputStream fos = new FileOutputStream(outFile);
		
		// 파일 복사 코드
		byte[] b = new byte[10];
		int len = 0;
		
		while ((len = fis.read(b)) != -1) {
			fos.write(b, 0, len);
		}
		
		
		fis.close();
		fos.close();
	}
}
