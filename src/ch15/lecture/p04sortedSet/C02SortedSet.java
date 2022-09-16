package ch15.lecture.p04sortedSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class C02SortedSet {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();
		
		set.add(300);
		set.add(100);
		set.add(99);
		set.add(10000);
		set.add(-2);
		
		System.out.println(set);
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.headSet(100)); // 100미만 출력
		System.out.println(set.tailSet(100)); // 100이상 출력
		
		NavigableSet<Integer> nset = (NavigableSet<Integer>) set;
		System.out.println(nset.lower(99)); // 99 이전 출력
		System.out.println(nset.floor(99)); // 99 포한 이전 출력
		System.out.println(nset.higher(100)); // 100 이후 출력
		System.out.println(nset.ceiling(100)); // 100 포함 이후 출력
	}
}
