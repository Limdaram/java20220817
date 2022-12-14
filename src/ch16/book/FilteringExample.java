package ch16.book;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n)); // 중복 빼기 : 홍길동 신용권 감자바 신민철

		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n)); // '신'으로 시작하는 names
		
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n)); // 중복 빼고 '신'으로 시작하는 names
	}
}
