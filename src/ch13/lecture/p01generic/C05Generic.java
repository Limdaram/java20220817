package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C05Generic {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("3");
//		list.add(6); // add 타입은 String
		
		String v1 = list.get(0); // 형변환 없이 사용 가능
		
		System.out.println(v1);
		
		
	}
}
