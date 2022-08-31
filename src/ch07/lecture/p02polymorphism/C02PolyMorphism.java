package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C02PolyMorphism {
	public static void main(String[] args) {
		String s1 = "java";
		Object s2 = "hello"; // object 안에 string
		
//		String s3 = s2; // 안됨
		
		Scanner scanner = new Scanner("");
		Object s4 = scanner; // object 안에 scanner
		Object s5 = new Scanner("hello");
	}
	
	// object 안에 string 과 scanner
}
