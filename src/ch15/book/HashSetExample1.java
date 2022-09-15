package ch15.book;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator(); // 반복자 얻기
		while (iterator.hasNext()) { // 객체 수만큼
			String element = iterator.next(); // 한개의 객체 가져오기
			System.out.println("\t" + element);
		}
		
		System.out.println("향상된 for 문 : ");
		for (String element : set) {
			System.out.println(element);
		}
		
		System.out.println("forEach 메소드 사용 : ");
		set.forEach((e) -> System.out.println("\t" + e));
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);			
			}
		
		set.clear(); // 모든 객체를 제거하고 비움
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
