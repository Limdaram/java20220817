package ch04.lecture.p02method;

public class C01Method {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		// call method (invoke method)
		method1();
		method1();
		// 여러번 호출 가능
		
		System.out.println(4);
		method1();
		System.out.println(5);
		System.out.println(6);
		
		System.out.println("-------------------");
		method2();
		
		
		
	}
	
	// 메소드(method)
	public static void method1() {
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	}
	
	public static void method2() {
		
		int a = (int)(Math.random()*10)+1;
		System.out.println(a);
	}
}
