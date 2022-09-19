package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class C07Mapping {
	public static void main(String[] args) {
		// map 메소드 : 원본 원소의 타입을 다룬 타입으로 변경한 스트림을 리턴
		int r1 = Stream.of("3", "6", "9", "1")
			.map((n) -> Integer.valueOf(n)) // string을 integer 변경
			.reduce((a, b) -> a + b)
			.get(); 
		System.out.println(r1);
		
		int r2 = Stream.of("3house", "2water", "1cup", "7pc", "9cpu")
			.map((n) -> n.substring(0, 1))
			.map((n) -> Integer.valueOf(n))
			.reduce((x,y) -> x + y)
			.get();
		System.out.println(r2);
		
		int r3 = Stream.of("3house", "2water", "1cup", "7pc", "9cpu")
			.mapToInt((n) -> Integer.parseInt(n.substring(0, 1)))
			.sum();
		System.out.println(r3);
	}
}
