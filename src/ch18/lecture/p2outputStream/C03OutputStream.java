package ch18.lecture.p2outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03OutputStream {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output3.txt";
		OutputStream os = new FileOutputStream(name);
		
		// write(byte[] b, int off, int len)
		// param1 : 쓸 데이터
		// param2 : 배열의 시작 위치.
		// param3 : 시작위치부터의 길이
		
		byte[] b = new byte[100];
		os.write(b, 1, 3); // b 배열의 1인덱스 ~ 3인덱스 (3 byte) 쓰기
		os.write(b, 0, 15); // b 배열의 0인덱스~14인덱스 (15byte) 쓰기
		os.write(b, 50, 30); // b 배열의 50인덱스~79인덱스 (30byte) 쓰기
		// 3 + 15 + 30 = 48바이트 사용
		
		os.close();
	}
}
