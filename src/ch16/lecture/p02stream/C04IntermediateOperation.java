package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class C04IntermediateOperation {
	public static void main(String[] args) {
		// 중간 연산(메소드) : 리턴 타입 -> ~~Stream

		// limit : element 갯수 제한
		Integer r1 = Stream.of(3, 4, 5, 9, -1, 10, 11)
				.limit(5)
				.max((x, y) -> x - y)
				.get(); // 5개까지(limit) 중의 max
		System.out.println(r1);
		
		// skip : element 몇 개 무시
		Integer r2 = Stream.of(3,4,5,9,10,11)
				.skip(2) // 앞에 2개 무시하고(skip) min
				.min((x,y) -> x - y)
				.get();
		System.out.println(r2);
		
		// filter : predicate에서 true 나온 것만 추림
		Integer r3 = Stream.of(3,4,5,6,7)
				.filter((e) -> e % 2 == 0) // 짝수만 추려서
				.reduce((x, y) -> x + y) // 다 더하기
				.get();
		System.out.println(r3); 
		
		Integer r4 = Stream.of(3,4,5,6,7)
				.filter((e) -> e % 2 == 1) // 홀수만 추려서
				.reduce((x, y) -> x + y) // 다 더하기
				.get();
		System.out.println(r4); 
		
		// distinct : 중복 제거
		Integer r5 = Stream.of(3,3,4,4,5,5,5,6,7)
				.distinct()
				.reduce((x, y) -> x + y)
				.get();
		System.out.println(r5);
		
		// sorted : 정렬한 스트림 리턴
		Stream.of(5,3,0,7,9,1)
				.sorted()
				.forEach(e -> System.out.println(e));
		
		// 중간연산 조합
		Stream.of(5,3,0,7,9,1)
				.sorted()
				.limit(3)
				.forEach(e -> System.out.println(e));
		
		Stream.of(5,3,0,7,9,1)
				.limit(3)
				.sorted() // 순서에 따라 결과값이 달라진다
				.forEach(e -> System.out.println(e));

	}
}
