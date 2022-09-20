package ch16.lecture.p02stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C18ConstructorReference {
	public static void main(String[] args) {
		Set<String> set3 = Stream.of("java", "spring", "css", "jsp", "html")
				.collect(Collectors.toCollection(() -> new TreeSet<>())); // 순서를 넣고 싶다면 TreeSet
			
			System.out.println(set3);
			
		Set<String> set4 = Stream.of("java", "spring", "css", "jsp", "html")
				.collect(Collectors.toCollection(TreeSet :: new)); // 순서를 넣고 싶다면 TreeSet
			
			System.out.println(set4);
	}
}
