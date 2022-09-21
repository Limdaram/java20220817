package ch18.book.exercise.s07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/ch18/book/exercise/s07/AddLineNumberExample.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		while ((line = br.readLine()) != null) {
			System.out.println();
		}
		
		fr.close();
		br.close();
	}
}
