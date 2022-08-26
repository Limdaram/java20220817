package ch06.lecture.p03method;

public class C03Parameter {
	public static void main(String[] args) {
		MyClass3 o1 = new MyClass3();
		
		o1.method1();
		o1.method2(3); // 아규먼트
		o1.method3("hello");
		o1.method4("임채은", "임다람");
		o1.method5(3, "임채은");
		o1.method6();
		o1.method6(1, 3);
		o1.method6("임채은", 3);
		
		o1.method7(99, "임채은");
		o1.method7(10, "임다람");
	}
}
