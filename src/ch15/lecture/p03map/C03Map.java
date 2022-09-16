package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C03Map {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("seoul", "korea");
		map.put("busan", "korea");
		map.put("osaka", "japan");
		map.put("newyork", "us");
		
		System.out.println(map);
		
		// of 메소드 사용
		Map<String, String> map2 = Map.of(
				"seoul", "korea",
				"busan", "korea",
				"osaka", "japan",
				"newyork", "us");
		
		System.out.println(map2);
		
//		map2.put("london", "uk");
//		map2.put("busan", "china");
		
		System.out.println(map2.size());
		System.out.println(map2.containsKey("seoul")); // true
		System.out.println(map2);
					
		
	}
}
