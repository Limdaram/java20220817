package ch15.book.exercise.s09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int totalScore = 0;
		int maxScore = Integer.MIN_VALUE;
		
		
		
		
		for (int num : map.values()) {
			totalScore += num;
			maxScore = Math.max(num, maxScore);
		}

		System.out.println("평균점수 : " + totalScore / map.size());
		System.out.println("최고점수 : " + maxScore);

		Set<String> keys = map.keySet();
		for (String key : keys) {
			Integer val = map.get(key);
			
			if(val == maxScore) {
				name = key;
//				System.out.println("최고점수를 받은 아이디 : " + name);
			}			
		}
		System.out.println(name);
		
		
		

		
	}
}
