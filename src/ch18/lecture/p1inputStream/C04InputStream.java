package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C04InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/C04InputStream.java";
		InputStream is = new FileInputStream(path);
		
		byte[] buffer = new byte[10];
		
		int cnt = 0;
		while((is.read(buffer) != -1)) {
			cnt++;
		}
		
		System.out.println(cnt + "번 읽음"); // 57 출력
		// 파일 크기가 56X 
		
		is.close();
	}
}
