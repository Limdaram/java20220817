package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C07Filter {
	public static void main(String[] args) {
		
		try (
				FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\output\\output13.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader bf = new BufferedReader(isr);
				
				FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\output\\output14.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				
				) 
		{
				char[] cbuf = new char[1000];
				int len = 0;
				
				while ((len = bf.read(cbuf)) != -1) {
					bw.write(cbuf, 0, len);
				}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
