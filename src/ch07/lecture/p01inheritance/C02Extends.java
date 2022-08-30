package ch07.lecture.p01inheritance;

public class C02Extends {
	public static void main(String[] args) {
		SubClass3 o1 = new SubClass3();
		SuperClass3 o2 = new SuperClass3();
		
		// o1은 supersuper와 super 그리고 자기자신 sub
		// 그러므로 1,2,3 3가지 전부 출력
		o1.method1();
		o1.method2();
		o1.method3();
		
		// o2는 supersuper와 자기자신 super 이므로
		// 1과 2만 출력
		o2.method1();
		o2.method2();
		
	}
}
