package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class C01Writer {
	public static void main(String[] args) throws Exception {
		// writer : 문자 단위로 출력하는 스트림
		// 주요 : write
		// 이미지 복사는 안됨
		
		String fileName = "C:\\Users\\user\\Desktop\\output\\output5.txt";
		Writer wr = new FileWriter(fileName);
		
		// Write(int) : 문자 하나 출력하는 메소드
		wr.write('a');
		wr.write('b');
		wr.write('한');
		wr.write(9742); // 아이콘 삽입
		
		
		wr.close();
	}
}
