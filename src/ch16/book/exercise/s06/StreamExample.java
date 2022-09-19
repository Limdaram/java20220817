package ch16.book.exercise.s06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26)
				);
		
		double avg = list.stream()
				.map(n -> n.getAge())
				.map(n -> Double.valueOf(n))
				.reduce((x, y) -> x + y)
				.get();

		
		System.out.println("평균 나이 : " + avg / list.size());
				
	}
}
