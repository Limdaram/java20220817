package ch18.lecture.p6filter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class C02OutputStreamWriter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output10.txt";
		FileOutputStream fos = getFileOutputStream(name);
		Writer wr = new OutputStreamWriter(fos);
		
		wr.write('a');
		wr.write('b');
		wr.write('가');
		wr.write('나');
		wr.write('다');
		
		wr.close();
		fos.close();
	}
	
	private static FileOutputStream getFileOutputStream(String fileName) throws Exception {
		return new FileOutputStream(fileName);
	}
}
