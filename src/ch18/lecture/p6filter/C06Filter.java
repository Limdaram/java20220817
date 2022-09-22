package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class C06Filter {
	public static void main(String[] args) {
		String name = "C:\\Users\\user\\Desktop\\output\\output13.txt";
		
		try (			
				FileInputStream fis = new FileInputStream(name);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader bf = new BufferedReader(isr);
				) 
		{
				String line = null;
				while ((line = bf.readLine()) != null) {
				System.out.println(line);
			
				}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
