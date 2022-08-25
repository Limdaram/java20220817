package ch05.lecture.p03String;

public class C01String {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b); // ture
		
		String s1 = "java";
		String s2 = "java";
		String s3 = "ja";
		String s4 = "va";
		String s5 = s3 + s4;
		
		System.out.println(s1 == s2); // true
		
		System.out.println(s1);
		System.out.println(s5);
		
		System.out.println(s1 == s5); // false // 같은 java java 지만 false
		
		System.out.println(System.identityHashCode(s1)); // 참조값 604107971
		System.out.println(System.identityHashCode(s2)); // 참조값 604107971
		System.out.println(System.identityHashCode(s5)); // 참조값 123961122
		
		// 내용물이 같더라도 참조값이 다를 수 있다
		
		// String content 비교
		// .equals() 또는 .contentEquals() 사용
		
		System.out.println(s1.equals(s5)); // true
		System.out.println(s1.contentEquals(s5));
		
		
	}
}
