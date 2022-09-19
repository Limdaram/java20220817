package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C08Mapping {
	public static void main(String[] args) {
		// IntStream (primitive type stream) -> Stream<Integer>
		
		IntStream.of(3, 5, 9, 1, 0)
			.boxed()
			.sorted((a,b) -> b - a) // 거꾸로 출력 // boxed 한 뒤 sorted
			.forEach((e) -> System.out.println(e));
		
		// integer을 String으로 바꿔서 거꾸로 출력하기
		String res = IntStream.of(3, 5, 9, 1, 0)
				.boxed()
				.sorted((x,y) -> y - x)
				.map((n) -> String.valueOf(n))
				.reduce((a, b) -> a + ", " + b)
				.get();


		
		System.out.println(res);
				
				
		
	}
}
