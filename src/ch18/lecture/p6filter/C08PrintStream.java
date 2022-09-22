package ch18.lecture.p6filter;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class C08PrintStream {
	public static void main(String[] args) {
		String name = "C:\\Users\\user\\Desktop\\output\\output15.txt";
		
		try (
				FileOutputStream fos = new FileOutputStream(name);
				PrintWriter ps = new PrintWriter(fos); // PrintStream 또는 PrintWriter
				) {
				ps.write(97); // a
				ps.print(97); // 97
				
				ps.println(3.14);
				ps.println('가');
				ps.println(true);
				
				System.out.println("hello world");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
