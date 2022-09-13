package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C04ArrayList {
	public static void main(String[] args) {
		ArrayList List = new ArrayList();
		List.add(3);
		List.add("3");
		
		int v1 = (Integer) List.get(0);
		int v2 = (Integer) List.get(1);
		
		System.out.println(v1);
		System.out.println(v2);
		
		
	}
}
