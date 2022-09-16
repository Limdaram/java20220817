package ch15.lecture.p04sortedSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C01SortedSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new TreeSet<>();
		Set<Integer> set3 = new TreeSet<>();
		
		set1.add("100");
		set1.add("200");
		set1.add("3");
		set1.add("99");
		set1.add("1");
		
		set2.add("100");
		set2.add("200");
		set2.add("3");
		set2.add("99");
		set2.add("1");
		
		set3.add(100);
		set3.add(200);
		set3.add(3);
		set3.add(99);
		set3.add(1);
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
