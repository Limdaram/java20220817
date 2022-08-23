package ch04.lecture.p02method;

public class C05Parameter {
	public static void main(String[] args) {
		method1(3);
		method2(2); // 정수는 실수 안에 들어가기 때문에 double 타입이여도 정수 가능
		method2(3.14);
//		method1(3.14); // 하지만 integer 타입에 실수 넣을 수는 없다
		
		int a = 3;
		method1(a);
		
		double b = 3.14;
		method2(b);
		
		method3(1,2,3); // 3개 선언했으면 꼭 3개 넣어줘야 한다
		method4(1,3.14); // 타입도 맞춰서 넣자
		
	}
	
	public static void method1(int param) {
		
	}
	
	public static void method2(double param) {
		
	}
	
	public static void method3(int p1, int p2, int p3) {
		
	}
	
	public static void method4(int p1, double p2) {
		
	}
	
}
