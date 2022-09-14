package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C04List {
	public static void main(String[] args) {
		// List : 순서가 있다
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("css");
		list.add("java"); // 순서가 다르기 때문에 0번째 java와 다른 java 
		list.add(null);
		
		System.out.println(list);
	}
}
