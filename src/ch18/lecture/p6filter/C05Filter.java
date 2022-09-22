package ch18.lecture.p6filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C05Filter {
	public static void main(String[] args) throws Exception {
		// 여러 stream을 감싸서 사용할 수 있다
		String name = "C:\\Users\\user\\Desktop\\output\\output13.txt";
		OutputStream os = new FileOutputStream(name);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		for (int i=0; i<10000; i++) {
			bw.write("다람쥐");
			bw.write("\n");
			
		}
		
		bw.close();
		osw.close();
		os.close();
		
	}
}
