package ch15.lecture.p01list;

import java.util.List;
import java.util.Vector;

public class C05Vector {
	public static void main(String[] args) {
		// thread-safe 하게 사용할때는 vector 사용
		// 하지만 특별한 이유 없으면 ArrayList 쓰자
		List<String> list = new Vector<>();
		list.add("java");
		list.add("css");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.add(0, "spring");
		System.out.println(list);
		
		for (String item : list) {
			System.out.println(item);
		}
	}
}
