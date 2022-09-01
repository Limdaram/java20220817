package ch08.lecture.p01interface;

import java.io.Serializable;

public class C05Instanceof {
	public static void main(String[] args) {
		String s1 = "topgun";
		
		System.out.println(s1 instanceof String);
		System.out.println(s1 instanceof Serializable);
		System.out.println(s1 instanceof Comparable<?>);
		System.out.println(s1 instanceof CharSequence);
	}
}
