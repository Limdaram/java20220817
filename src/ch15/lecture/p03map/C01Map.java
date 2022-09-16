package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C01Map {
	public static void main(String[] args) {
		// Map
		// (key, value) 쌍(entry)으로 저장
		// key는 중복될 수 없음
		// key는 하나의 value에 매핑됨
		
		Map<String, String> map = new HashMap<>();
		
		// entry 추가
		map.put("jimin", "bts");
		map.put("hangman", "topgun");
		map.put("batman", "dc");
		map.put("captain", "marvel");
		map.put("rm", "bts"); // value는 중복돼도 된다
		map.put("jimin", "exo"); // 이미 있는 key, value 덮어 씀
		
		// entry 수 얻기
		int size = map.size();
		System.out.println(size); // 5개
		
		// 지우기
		map.remove("batman");
		System.out.println(map.size()); // 4개
		
		map.remove("coyote");
		System.out.println(map.size()); // 4개
		
		// 이미 있는 키 인가?
		boolean hasJimin = map.containsKey("jimin");
		System.out.println(hasJimin);// 있으니까 true
		
		System.out.println(map.containsKey("batman")); // batman 지웠으니까 false
		
		// value 얻기
		String val1 = map.get("jimin");
		System.out.println(val1);
		
		System.out.println(map.get("rm"));
		System.out.println(map.get("batman")); // 없으면 null
		
		
	}
}
