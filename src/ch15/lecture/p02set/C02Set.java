package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
	public static void main(String[] args) {
		// 전체 탐색 방법
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("spring");
		set.add("jsp");
		set.add("css");
		set.add("html");
		set.add("java");
		
		System.out.println("향상된 for 문"); // set은 향상된 for문 쓰기
		for (String element : set) {
			System.out.println(element); // 넣은 순서와 탐색하는 순서가 같다고 보장할 수 없다
		}
		
		System.out.println("Iterator 사용");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("forEach 메소드 사용");
		set.forEach((e) -> System.out.println(e));
	}
}
