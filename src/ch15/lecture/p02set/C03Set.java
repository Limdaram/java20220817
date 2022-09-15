package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C03Set {
	public static void main(String[] args) {
		// set 만들기
		Set<String> set1 = new HashSet<>(); // 수정 가능한 set
		set1.add("bob");
		set1.add("hangman");
		set1.add("goose");
		
		set1.remove("goose");
		
		System.out.println(set1);
		
		// 수정 불가능한 set
		Set<String> set2 = Set.of("thor", "hulk", "batman"); // 중복된 값도 넣을 수 없다
		System.out.println(set2);
		
		System.out.println(set2.contains("thor"));
		System.out.println(set2.size());
		
//		set2.add("superman"); // 안됨
//		set2.remove("hulk"); // 안됨
	}
}
