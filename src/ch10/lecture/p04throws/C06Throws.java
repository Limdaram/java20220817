package ch10.lecture.p04throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C06Throws {
	public static void main(String[] args) throws IOException {
		method1();
	}
	
	private static void method1() throws IOException {
		FileReader a = new FileReader("a");
	}
}
