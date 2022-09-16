package ch15.book;

import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("안유진", "아이브");
		map.put("장원영", "아이브");
		map.put("지효", "트와이스");
		map.put("리사", "블랙핑크");
		
		// of 메소드 사용
		Map<String, String> map1 = Map.of(
				"안유진", "아이브",
				"장원영", "아이브",
				"지효", "트와이스",
				"리사", "블랙핑크");
		
		
		System.out.println("map 총 개수 : " + map.size());
		System.out.println("\t" + map);
		
		System.out.println("map1 총 개수 : " + map1.size());
		System.out.println("\t" + map1);
	}
}
