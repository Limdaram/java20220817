package ch16.lecture.p02stream;

import java.util.List;

public class C09Parallel {
	public static void main(String[] args) {
		// 병렬 stream
		List<String> list1 = List.of("java", "spring", "css", "jsp", "html");
		list1.parallelStream()
			.forEach((n) -> System.out.println(n)); // 순서 보장x 
		
		System.out.println("------------");
		
		list1.parallelStream()
			.forEachOrdered((n) -> System.out.println(n)); // 순서대로
	}
}
