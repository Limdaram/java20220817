package ch13.lecture.p05Swildcard;

import java.util.ArrayList;

public class C02Polymorphism {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		
		// String을 Object라고 할 수 는 있지만
		// ArrayList<String>을 ArrayList<Object>라고 할 수 는 없다
		
//		ArrayList<Object> list2 = list1;
//		list2.add(new Object());
	}
}
