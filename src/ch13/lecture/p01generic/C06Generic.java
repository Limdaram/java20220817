package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C06Generic {
	public static void main(String[] args) {
		// type parameter에 기본타입은 넣을 수 없음
//		ArrayList<int> list = new ArrayList<int>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
//		list.add("3"); // 타입을 Integer로 선언했기 때문에 String은 안됨
		
		Integer v1 = list.get(0);
		System.out.println(v1);
	}
}
