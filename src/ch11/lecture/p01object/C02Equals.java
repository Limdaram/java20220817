package ch11.lecture.p01object;

public class C02Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.equals(o2)); // false
		System.out.println(o2.equals(o1)); // 반대로 해도 false
		System.out.println(o1.equals(o1)); // 자기 자신이랑 하면 true
		System.out.println(o2.equals(o2)); // true
		
		System.out.println("String equals()");
		
		Object o3 = new String("topgun");
		Object o4 = new String("topgun");
		
		System.out.println(o3.equals(o4)); // true
		System.out.println(o4.equals(o3));
		System.out.println(o3.equals(o3));
		
		System.out.println("-----String-----");
		System.out.println(o3 == o4); // false // 문자열비교는 .equals 사용
	}
}
