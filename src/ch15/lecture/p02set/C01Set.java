package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// 아이템 (element) 추가
		set.add("ironman");
		set.add("captain");
		set.add("black");
		set.add("hulk");
		
		// element 수
		int size = set.size();
		System.out.println(size); // 4
		
		// 중복 저장 할 수 없음
		System.out.println(set.add("hulk")); // 중복 안됨 false
		set.add("hulk");
		System.out.println(size); // 추가를 해도 hulk가 이미 있기 때문에 중복 저장이 안된다 // 4
		
		// 이미 있는지 확인
		System.out.println(set.contains("captain")); // 있으면 true
		System.out.println(set.contains("batman")); // 없으면 false
		
		// 지우기
		System.out.println(set.remove("captain")); // 있으면 true
		System.out.println(set.remove("superman")); // 없으면 false
		
		System.out.println(set.contains("captain")); // 지웠으니까 없어서 false
	}
}
