package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C06WildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(200);
		
		ArrayList<? super Integer> list2 = list1; // integer 상위 타입 모두 가능 // integer, number, object....
		list2.add(300);
		
		// Upper Bounded WildCard
		ArrayList<? extends Integer> list3 = list1; 
		Integer i1 = list3.get(0); // integer의 0번째 아이템을 꺼내 integer에 넣기
		
		ArrayList <? extends Number> list4 = list1; // number 하위 타입만 가능 // number, integer...
//		Integer i2 = list4.get(0); // number의 0번째 아이템을 꺼내 integer에 넣기 // 안됨
	}
}

