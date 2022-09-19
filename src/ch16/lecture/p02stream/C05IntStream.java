package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class C05IntStream {
	public static void main(String[] args) {
		
		// IntStream : 기본타입 int가 요소인 stream
		
		// 생성 방법1 : of static 메소드
		int r1 = IntStream.of(10,9,20,2,3,-1)
			.sum();
		System.out.println(r1);
		
		// 생성 방법2 : Arrays.stream
		int r2 = Arrays.stream(new int[] {10,9,20,2,3,-1})
				.sum();
		System.out.println(r2);
		
		// 생성 방법3 : IntStream range static 메소드
		//            IntStream rangeClosed
		int r3 = IntStream.range(1, 11) // 1부터 10까지
				.sum();
		System.out.println(r3);
		
		int r4 = IntStream.rangeClosed(1, 10) // 1부터 10까지
				.sum();
		System.out.println(r4);
		
		// 생성 방법4 : IntStream.generate static 메소드
		IntStream.generate(() -> 1) // 1 무한대
				.limit(5) // 5개
				.forEach(n -> System.out.println(n)); // 1 5개
		
		IntStream.generate(() -> (int) (Math.random() * 45) + 1) // 0부터 45까지 중 랜덤으로
				.limit(6) // 6개
				.forEach(n -> System.out.println(n));
		
	}
}
