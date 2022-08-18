package ch02.lecture;

public class C11String {
	public static void main(String[] args) {
		// String : 문자열(char타입의 나열)
		// char : 문자(하나)
		
		char a = '냐'; // 작은따옴표
		String b = "java"; // 큰따옴표
		String c = ""; // 빈 문자열
		
		// + (연결연산)의 결과는 String
		String d = "hello";
		char e = '!';
		String f = d + e;
		System.out.println(f);
		
		String g = d + 100;
		System.out.println(g);
		
		String h = d + 3.14;
		System.out.println(h);
		
		String i = d + true;
		System.out.println(i);
		
		String j = d + " java";
		System.out.println(j);

		// 참조타입 (객체) : 필드와 메소드가 있음
		String k = "bts";
		char l = k.charAt(0); // charAt 메소드 // 정수 넣기 // 결과는 char 타입
		int m = k.charAt(0);
		
		char n = k.charAt(0); // b
		char o = k.charAt(1); // t
		char p = k.charAt(2); // s
		
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		
//		k.charAt(3); // indexOutOfBoundsException : 던져짐(발생)
		
		// length : 문자열의 길이
		int q = k.length();
		System.out.println(q);
		
		String r = "javascript";
		System.out.println(r.length());
		
		System.out.println("hello world".length()); // 띄어쓰기의 길이는 0
		
		System.out.println(r.charAt(r.length()-1));
		
		// substring 
		
		String s = r.substring(0); // javascript
		System.out.println(s);
		System.out.println(r.substring(1));  // avascript
		System.out.println(r.substring(2)); // vascript
		System.out.println(r.substring(3)); // ascript
		System.out.println(r.substring(10)); //
		
		// substring (int, int)
		
		System.out.println(r.substring(0,9));
		System.out.println(r.substring(0,10));
		System.out.println(r.substring(0,4)); //0에서 3번 인덱스를 얻고싶으면 0에서 4(3+1) 입력 // 시작은 그대로
		System.out.println(r.substring(2,4));
		
	}
}
