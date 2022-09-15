package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C04Set {
	public static void main(String[] args) {
		// element가 같은지 판단
		// equals 메소드로 한다
		
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("java");
		System.out.println(set.add(new String("java"))); // 이미 있기때문에 못들어감 // false
		System.out.println(set); // java, css
	}
}
