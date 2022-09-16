package ch15.lecture.p04sortedSet;

import java.util.TreeSet;

public class C07Comparator {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("java");
		set.add("css");
		set.add("html");
		set.add("CSS"); // 대문자 먼저
		
		System.out.println(set);
	}
}
