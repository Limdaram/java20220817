package ch13.lecture.p05Swildcard;

import java.util.ArrayList;

public class C04WildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(300);
		
		// ? : unbounded wildcard
		ArrayList<?> list2 = list1;
//		list2.add(500); // 안됨
		
		// ? super Type : LowerBounded wildcard
		ArrayList<? super Integer> list3 = list1;
		list3.add(500); // 됨
		
	}
}
