package ch16.book.exercise.s05;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		
		list.stream()
			.filter(n -> n.toUpperCase().contains("JAVA"))
			.forEach(n -> System.out.println(n));
		
		
	}
}
