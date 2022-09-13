package ch13.lecture.p05Swildcard;

import java.util.ArrayList;

public class C03WildCard {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("maverick");
		list1.add("iceman");
		
		ArrayList<?> list2 = list1; // 가능
//		list2.add(""); // 불가능
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(100);
		list3.add(200);
		
		ArrayList<?> list4 = list3;
//		list4.add(300); // 불가능
//		list4.add(new Object()); // 불가능
		Object o1 = list4.get(0); // 꺼내는건 가능 // 꺼내서 Object에 넣기
	}
}
