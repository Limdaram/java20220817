package ch03.lecture.p2inary;

public class C06ComparisonString {
	public static void main(String[] args) {
		// String 끼리 크기 비교 연산 안됨 (<, <=, >, >=)
		String a = "hello";
		String b = "hi";
		
//		System.out.println(a<b); // 안됨
		
		// String 끼리 같은지 비교 연산 (==, !=)
		// equals 메소드 쓰기!!
		String c = "java";
		String d = "java";
		String e = "ja";
		String f = "va";
		String g = e + f; // java
		
		
		System.out.println(c == d); // true
		System.out.println(c == g); // false
		// 이렇게 오류가 많이 나니까 되도록 쓰지 말자
		
		System.out.println(c.equals(d)); // true
		System.out.println(c.equals(g)); // true
		// String끼리 비교할때 .equals();를 이용하자
		
		
	}
}
